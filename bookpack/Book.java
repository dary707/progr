package bookpack;
public class Book {
	protected String title;
       	protected String autgor;
	protected int pubDate;

	public Book(String t, String a, int d) {
		title = t;
		author = a;
		pubdate = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubdate);
		System.out.println();
	}
}

	
