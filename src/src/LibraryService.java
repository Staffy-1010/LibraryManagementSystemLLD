import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class LibraryService {

    BookController bookController;
    MemberController memberController;

    LibraryService(BookController bookController,MemberController memberController){
        this.bookController = bookController;
        this.memberController = memberController;
    }

    public boolean getAvailabilityOfBook(String id){
        Book book = bookController.getBook(id);

        if(book.count == 0){
            System.out.println("Sorry! The Book is not available at the moment");
            return false;
        }

        return true;
    }

    public void borrowBook(String memId,String bookId){
        BorrowService borrowService = new BorrowService(bookController,memberController);
        borrowService.borrowBook(memId,bookId);
    }

}
