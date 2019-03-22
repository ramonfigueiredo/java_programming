package com.rfp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender sender;

    private Logger logger = LoggerFactory.getLogger(EmailService.class);

    public String sendMail(String emailList, String subject, String text, Boolean isHTMLContent, String filePathList) {

        String returnMsg;
        try {
            MimeMessage message = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,true, "utf-8");

            String[] emailArr = emailList.split(";");
            helper.setTo(emailArr);
            helper.setSubject(subject);
            helper.setText(text, isHTMLContent);

            if (filePathList != null && filePathList.length() > 0) {
                String[] filePathArr = filePathList.split(";");
                for (String filePath : filePathArr) {
                    FileSystemResource attachment = new FileSystemResource(new java.io.File(filePath));
                    String fileName = new java.io.File(filePath).getName();
                    helper.addAttachment(fileName, attachment);
                }
            }

            sender.send(message);

            if (filePathList != null && filePathList.length() > 0) {
                returnMsg = String.format("Email with subject [%s] was sent to [%s] with success attaching the [%s] files.", subject, emailList, filePathList);
            } else {
                returnMsg = String.format("Email with subject [%s] was sent to [%s] with success.", subject, emailList);
            }

            logger.info(returnMsg);
        } catch (MessagingException e) {
            returnMsg = "Error sending email: " + e.getMessage();
            logger.error(returnMsg);
        }
        return returnMsg;
    }
}
