import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    private List<User> users;

    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void addUser(User user){
        users.add(user);
    }
    public void borrowBook(String bookId,String userId){
        for (Book book : books){
            if (book.getId().equals(bookId) && book.isAvailable()){
                book.setAvailable(true);
                System.out.println("Книга взята: " + book.getTitle() + " Пользователь: " + userId);
            return;
            }
        }
        System.out.println("Книга недоступна или не существует.");
    }
    public void returnBook(String bookId){
        for (Book book : books) {
            if (book.getId().equals(bookId) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("Книга возвращена: " + book.getTitle());
                return;
            }
        }
        System.out.println("Эта книга не была заимствована");
    }
    public void listAvailableBooks(){
        System.out.println("Доступные книги: ");
        for (Book book : books){
            if (book.isAvailable()){
                System.out.println("Книги");
            }
        }
    }
}
