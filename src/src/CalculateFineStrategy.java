import java.time.LocalDateTime;

public interface CalculateFineStrategy {
    double getBookFine(LocalDateTime expectedReturnTime, LocalDateTime actualReturnTime);
}
