package day20;

public class Book {

	String title;
	boolean iscomplet;
	public Book(String title, boolean iscomplet) {
		super();
		this.title = title;
		this.iscomplet = iscomplet;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIscomplet() {
		return iscomplet;
	}
	public void setIscomplet(boolean iscomplet) {
		this.iscomplet = iscomplet;
	}
	
}
