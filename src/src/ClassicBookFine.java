import java.time.LocalDateTime;

public class ClassicBookFine implements CalculateFineStrategy{
    @Override
    public double getBookFine(LocalDateTime expectedReturnTime, LocalDateTime actualReturnTime) {
        return 5;
    }
}
