package composition;

public class UseLibrary {
	public static void main(String[] args) {
	Book book = new Book();
	book.title = "Ponnien Selvan";
	book.author = "Kalki";
	book.price = 1300;
	book.publicationYear = 1990;
	
	Library library = new Library();
	library.type = "College Library";
	library.location = "College";
	library.book = book;
	
	System.out.println(library.book.title);
	System.out.println(library.book.author);
	System.out.println(book.title);
	System.out.println(library.location);
	
	}
	

}
