import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("1", "1984", "George Orwell", 1949));
        library.addBook(new Book("2", "To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("3", "Alice", "", 1900));
        library.addBook(new Book("4", "Bob", "", 2001));

        while (true){
            System.out.println("1. Список доступных книг");
            System.out.println("2. Взять книгу напрокат");
            System.out.println("3. Вернуть книгу");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 : library.listAvailableBooks();
                break;
                case 2 : System.out.println("Введите идентификатор книги, которую хотите взять: ");
                         String bookId = scanner.nextLine();
                         System.out.println("Введите ID пользователя: ");
                         String userId = scanner.nextLine();
                         library.borrowBook(bookId, userId);
                break;
                case 3 : System.out.println("Введите идентификатор книги для возврата");
                         String returnBookId = scanner.nextLine();
                         library.returnBook(returnBookId);
                break;
                case 4 : System.exit(0);
                default : System.out.println("Неверный выбор");
            }
        }
    }
}
