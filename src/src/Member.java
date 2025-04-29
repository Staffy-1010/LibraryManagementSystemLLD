import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
    String memberID;
    String name;
    String emailId;
    double fine;
    Map<Book,BorrowDate> booksBorrowedCurrently;
    Map<Book, List<BorrowDate>> booksBorrowedInPast;

    public Member(String memberID, String name, String emailId) {
        this.memberID = memberID;
        this.name = name;
        this.emailId = emailId;
        this.fine = 0;
        this.booksBorrowedCurrently = new HashMap<>();
        this.booksBorrowedInPast = new HashMap<>();
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getFine() {
        return fine;
    }

    public void addOrSetFine(double fine) {
        this.fine += fine;
    }

    public Map<Book, BorrowDate> getBooksBorrowedCurrently() {
        return booksBorrowedCurrently;
    }

    public void setBooksBorrowedCurrently(Map<Book, BorrowDate> booksBorrowedCurrently) {
        this.booksBorrowedCurrently = booksBorrowedCurrently;
    }

    public Map<Book, List<BorrowDate>> getBooksBorrowedInPast() {
        return booksBorrowedInPast;
    }

    public void setBooksBorrowedInPast(Map<Book, List<BorrowDate>> booksBorrowedInPast) {
        this.booksBorrowedInPast = booksBorrowedInPast;
    }

    public void addBorrowBook(Book book, BorrowDate bd) {
        booksBorrowedCurrently.put(book,bd);
    }

    public BorrowDate getBorrowDate(Book book) {
        return booksBorrowedCurrently.get(book);
    }
}
