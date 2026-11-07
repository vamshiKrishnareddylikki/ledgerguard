import java.time.LocalDateTime;

public record Transaction(
        String accountNumber,
        TransactionType type,
        double amount,
        LocalDateTime timestamp
) {
}