import java.util.Scanner;

// Clase Base Persona (Herencia)
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

// Usuario Hereda de Person
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

// Libro con encapsulamiento
class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void showBook() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Disponible: " + (available ? "Sí" : "No"));
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void returnBook() {
        available = true;
    }
}

// Clase préstamo
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

// Clase principal
public class POO_Evidencia_Final_Final {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        // Objetos de ejemplo
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

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }

            option = sc.nextInt();

            switch (option) {

                case 1:
                    book.showBook();
                    break;

                case 2:
                    user.showRole();
                    System.out.println("Nombre: " + user.getName());
                    System.out.println("ID: " + user.getId());
                    break;

                case 3:
                    if (book.borrowBook()) {
                        System.out.println("Préstamo realizado con éxito.");
                        loan.showLoan();
                    } else {
                        System.out.println("El libro no está disponible.");
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
