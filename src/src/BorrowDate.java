import java.time.LocalDateTime;

public class BorrowDate {
    LocalDateTime borrowDate;
    LocalDateTime returnDate;

    public BorrowDate(LocalDateTime borrowDate, LocalDateTime returnDate) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
}
