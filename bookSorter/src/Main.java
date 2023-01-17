import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> book=new TreeSet<>();

        Book book1=new Book("Grand Pursuit: The Story of Economic Genius",576,"Sylvia Nasar", 2012);
        Book book2=new Book("The Name of the Wind", 722,"Patrick Rothfuss",2008);
        Book book3=new Book("Les Misérables",1042,"Novel by Victor Hugo",1862);
        Book book4=new Book("Fahrenheit 451", 350,"Ray Bradbury",1953);
        Book book5=new Book("The Goal",362 ,"Eliyahu M. Goldratt",1984);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        //sort by name
        System.out.println("Lexicographically:");
        for(Book bookName:book){
            System.out.println("Book Name: "+bookName.getBookName()+
                    "\nNumber of page: "+bookName.getNumberOfPages()+
                    "\nAuthor Name: "+bookName.getAuthorName()+
                    "\nReleased Date: "+bookName.getPublicationYear());
            System.out.println("------------------------------------------");
        }





        //number of page
        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getNumberOfPages()-b1.getNumberOfPages();
            }
        });

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);



        System.out.println("\n\n\n************************************");
        System.out.println("Number of page");


        for(Book bookPage:books){
            System.out.println("Book Name: "+bookPage.getBookName()+
                    "\nNumber of page: "+bookPage.getNumberOfPages()+
                    "\nAuthor Name: "+bookPage.getAuthorName()+
                    "\nReleased Date: "+bookPage.getPublicationYear());
            System.out.println("------------------------------------------");
        }



    }
}