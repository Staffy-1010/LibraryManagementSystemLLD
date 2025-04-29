import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class BookController {
    HashSet<Book> totalBooks;

    public BookController() {
        this.totalBooks = new HashSet<>();
    }

    public void addBook(Book book){
        if(totalBooks.contains(book)){
            for(Book book1: totalBooks){
                book1.count++;
            }
        }
        else{
            totalBooks.add(book);
        }
    }

    public void removeBook(Book book){
        totalBooks.remove(book);
    }

    public HashSet<Book> getTotalBooks() {
        return totalBooks;
    }

    public Book getBook(String bookId){
        for(Book book1: totalBooks){
            if(book1.getId().equals(bookId)){
                return book1;
            }
        }
        throw new NoBookFoundException();
    }
}
