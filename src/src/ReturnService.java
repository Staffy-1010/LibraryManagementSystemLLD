import java.time.LocalDateTime;

public class ReturnService {
    MemberController memberController;

    public void returnBook(String memberID,Book book){

        Member member = memberController.getMember(memberID);

        BorrowDate bd = member.getBorrowDate(book);

        LocalDateTime expectedReturnDate = bd.getReturnDate();

        if(LocalDateTime.now().isAfter(expectedReturnDate)){
            CalculateFineStrategy fineStrategy;
            if(book.price<300)
                fineStrategy = new ClassicBookFine(); // factory design pattern to if book is premium based on MRP category
            else {
                fineStrategy = new PremiumBookFine();
            }

            double fine = fineStrategy.getBookFine(expectedReturnDate,LocalDateTime.now());

            member.addOrSetFine(fine);

            double finePending = member.getFine();

            if(finePending != 0)
                System.out.println("Returned !!!!!!!!!! Fine Due!! Please Pay the Fine Rs." + finePending);

        }
    }
}
