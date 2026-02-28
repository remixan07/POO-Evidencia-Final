import java.util.Scanner

abstract class Person {
    private String name

    public Person(String name) {
        name = name;
    }

    public String getName() {
        return Name;
    }

    public abstract void showRole()
}

class LibraryUser extends Person {
    private int id

    public LibraryUser(String name, int id) {
        super(name)
        this.id = id;
    }

    public int getId() {
        return ID;
    }

    @Override
    public void showRole() {
        System.out.println("Rol Usuario del sistema")
    }
}

class Book {
    private String title;
    private String author
    private boolean available

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        available = true
    }

    public void showBook() {
        System.out.println("Título " + title)
        System.out.println("Autor " + author)
    }

    public boolean borrowBook() {
        if (available = true) {
            available = false
            return true
        }
        return false
    }
}

class Loan {
    private String startDate
    private String endDate;

    public Loan(String startDate, String endDate) {
        this.startDate = startDate
        this.endDate = endDate
    }

    public void showLoan() {
        System.out.println("Fecha inicio " + startDate)
        System.out.println("Fecha fin " + endDate)
    }
}

public class POO_Evidencia_Final_Final {

    public static void main(String args) {

        Scanner sc = new Scanner(System.in)

        Book book = new Book("Java Fundamentals", "Autor")
        LibraryUser user = new LibraryUser("Carlos", 101)
        Loan loan = new Loan("01/02/2026", "10/02/2026")

        int option = sc.nextInt()

        switch(option) {
            case 1
                book.showBook()
            break

            case 2:
                user.showRole()
                System.out.println(user.getName())
            break
        }
    }
}