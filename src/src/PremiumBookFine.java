import java.time.LocalDateTime;

public class PremiumBookFine implements CalculateFineStrategy{
    @Override
    public double getBookFine(LocalDateTime expectedReturnTime, LocalDateTime actualReturnTime) {
        return 10;
    }
}
