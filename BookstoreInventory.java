public class BookstoreInventory {

    static class Book {

        String title;
        String author;
        double price;
        String isbn;
        int stock;

        public Book(String title, String author, double price, String isbn, int stock) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.isbn = isbn;
            this.stock = stock;
        }

        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
            System.out.println("ISBN: " + isbn);
            System.out.println("Stock: " + stock);
            System.out.println("Available: " + isAvailable());
            System.out.println("-----------------------------");
        }

        public void applyDiscount(double percent) {
            price = price - (price * percent / 100);
            System.out.println(percent + "% discount applied.");
        }

        public void restock(int amount) {
            stock = stock + amount;
            System.out.println(amount + " copies added to stock.");
        }

        public boolean isAvailable() {
            return stock > 0;
        }
    }

    public static void main(String[] args) {

        Book novel = new Book(
                "The Midnight Library",
                "Matt Haig",
                14.99,
                "978-0-525-55947-4",
                10
        );

        Book textbook = new Book(
                "Introduction to Algorithms",
                "Cormen et al.",
                89.99,
                "978-0-262-03384-8",
                0
        );

        System.out.println("=== Popular Novel ===");
        novel.displayInfo();
        novel.applyDiscount(20);
        novel.restock(5);
        novel.displayInfo();

        System.out.println("=== Specialized Textbook ===");
        textbook.displayInfo();
        textbook.restock(3);
        textbook.applyDiscount(15);
        textbook.displayInfo();
    }
}
