package LIST;

import java.util.ArrayList;
import java.util.List;

public class Book {
	int id;
	String Name,author,publisher;
	int quantity;
	Book(int id,String Name,String author,String publisher,int quantity){
		this.id = id;
		this.Name = Name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		
	}
	public static void main(String[] args) {
		Book b1 = new Book(101,"let us see","Yashwant","bhusan",1);
		Book b2 = new Book(102,"c++","Ankit","Aditya",2);
		
		List<Book> b= new ArrayList<>();
		b.add(b1);
		b.add(b2);
		
		for(Book result : b) {
			System.out.println(result.Name);
			
		}
	}

}

