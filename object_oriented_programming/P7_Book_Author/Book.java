package P7_Book_Author;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Book {
	
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Author[] getAuthors()
	{
		return authors;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price; 
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		String finalStr = "";
		
		finalStr += "Book[name=" + getName() + ", authors={";
		
		for (Author author : getAuthors()) {
			String strAuthor = "Author[name=" + author.getName() + ", email=" + author.getEmail() + ", gender=" + author.getGender() + "]";
			finalStr += strAuthor + ",";
		}
		finalStr = finalStr.substring(0, finalStr.length()-1); // Remove the last extra comma
		
		finalStr += "}, price=" + getPrice() + ", qty=" + getQty() + "]";
		
		return  finalStr;
	}
	
	public static void main(String[] args) {
		
		Author[] authorVector = new Author[10];
		
		for (int i=0; i<10; i++) {
			Author author = null;
			
			if(i % 2 == 0)
			{
				author = new Author("AuthorName"+i, "Author"+i+"@gmail.com", 'm');
//				System.out.println(author);
			}
			else
			{
				author = new Author("AuthorName"+i, "Author"+i+"@gmail.com", 'f');
//				System.out.println(author);
			}
			
			authorVector[i] = author;
		}
		
		Book b = new Book("Book A", authorVector, 123.45, 2);
		
		System.out.println(b);
	}
}