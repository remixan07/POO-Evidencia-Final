import java.util.Scanner;

// Clase Base Persona
abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showRole();
}

// Usuario
class LibraryUser extends Person {
    private int id;

    public LibraryUser(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void showRole() {
        System.out.println("Rol: Usuario del sistema");
    }
}

// Libro
class Book {
    private String title;
    private String author;
    private boolean available = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBook() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
    }

    public boolean borrowBook() {
        if (available == true) {
            available = false;
            return true;
        }
        return false;
    }
}

// Préstamo
class Loan {
    private String startDate;
    private String endDate;

    public Loan(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void showLoan() {
        System.out.println("Fecha inicio: " + startDate);
        System.out.println("Fecha fin: " + endDate);
    }
}

// Principal
public class POO_Evidencia_Final_Final {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        Book book = new Book("Java Fundamentals", "Autor Desconocido");
        LibraryUser user = new LibraryUser("Carlos", 101);
        Loan loan = new Loan("01/02/2026", "10/02/2026");

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Ver libro");
            System.out.println("2. Ver usuario");
            System.out.println("3. Realizar préstamo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    book.showBook();
                    break;

                case 2:
                    user.showRole();
                    System.out.println("Nombre: " + user.getName());
                    break;

                case 3:
                    if (book.borrowBook()) {
                        System.out.println("Préstamo realizado.");
                        loan.showLoan();
                    } else {
                        System.out.println("Libro no disponible.");
                    }
                    break;

                case 0:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (option != 0);

        sc.close();
    }
}