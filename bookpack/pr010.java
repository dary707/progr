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

class pr010 {
	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("Иллиада", "Гомер", 1980);
		books[1] = new Book("Унесенные ветром", "Митчел", 2000);
		books[2] = new Book("Наедине с собой", "Аврелий", 1950);
		books[3] = new Book("Собор Парижской богоматери", "Гюго", 1970);
		books[4] = new Book("Преступление и наказание", "Достоевский", 1950);
		for(int i = 0; i < book.length; i++)
			books[i].show();
	}
}



