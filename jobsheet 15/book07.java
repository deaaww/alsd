public class book07 {

    public String isbn;
    public String title;

    public book07() {

    }

    public book07(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}