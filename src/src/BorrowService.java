import java.time.LocalDateTime;

public class BorrowService {
    MemberController memberController;
    BookController bookController;

    public BorrowService(BookController bookController,MemberController memberController) {
        this.bookController = bookController;
        this.memberController = memberController;
    }

    public void borrowBook(String memberID, String bookId){

        Member member = memberController.getMember(memberID);

        Book book1 = bookController.getBook(bookId);
        Book book = new Book(book1.id,book1.title,book1.author,book1.getISBN(),book1.publicationYear,book1.price);

        if(book1.count == 0){
            throw new BookNotAvailableException();
        }

        LocalDateTime borrowDate = LocalDateTime.now();
        LocalDateTime returnDate = LocalDateTime.now().plusDays(8);

        BorrowDate bd = new BorrowDate(borrowDate,returnDate); // startDate will be tomorrow uptil 7 days

        member.addBorrowBook(book,bd);
        book1.count--;

        System.out.println("Successfully borrowed till " + returnDate);

    }
}
