package com.rfp.controller;

import com.rfp.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @RequestMapping("/send")
    public String sendMail(@RequestParam(value = "emailList") String emailList,
                           @RequestParam(value = "subject") String subject,
                           @RequestParam(value = "text") String text,
                           @RequestParam(value = "isHTML", defaultValue = "false") Boolean isHTMLContent,
                           @RequestParam(value = "filePathList", required = false) String filePathList) {
        return emailService.sendMail(emailList, subject, text, isHTMLContent, filePathList);
    }
}
