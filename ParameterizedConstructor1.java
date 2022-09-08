package ThursdayLabTest;

import java.util.*;
import java.util.stream.Collectors;
class Book
{
	String id;
	String name;
	String author;
	String category;
	float price;
	
	public Book(String id,String name,String author, String category,float price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	void display()
	{
		System.out.println(id +" "+name+" "+author+ " "+category+ "  "+price);
	}
	
}

/*class BookStore extends Book
{
	public BookStore(String id, String name, String author, String category, float price) {
		super(id, name, author, category, price);
		
	}
	
}*/
public class ParameterizedConstructor1 {

	

	public static void main(String[] args) {
		Book b =new Book("Book", "python", "abc", "science", 120);
		Book b1 =new Book("Book", "java", "xyz", "fiction", 150);
		Book b2 =new Book("Book", "c++", "pqr", "technology", 180);
		b.display();
		b1.display();
		b2.display();
		
		ArrayList<Book> mylist=new ArrayList<Book>();
		mylist.add(b);                            //add a new Book object into the collection
		mylist.add(b1);
		mylist.add(b2);
		
		//search a book based on title and if found display the details
		List<String>searchByTitle =mylist.stream().map(p -> p.name).collect(Collectors.toList());
		System.out.println(searchByTitle);
	
		//search a book based on author and if found display the details
		List<String>searchByAuthor =mylist.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);
		
		

	}

}