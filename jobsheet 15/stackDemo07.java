import java.util.Stack;

public class stackDemo07 {
    public static void main(String[] args) {

        book07 book1 = new book07("1234", "Dasar Pemrograman");
        book07 book2 = new book07("7145", "Hafalan Shalat Delisa");
        book07 book3 = new book07("3562", "Muhammad Al-Fatih");

        Stack<book07> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book07 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        book07 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (book07 book : books) {
            System.out.println(book.toString());
        }

        /*langkah 7 proses debugging lebih sederhana dari System.out.println(book.toString()); adalah 
        System.out.println(books);*/
    }
}