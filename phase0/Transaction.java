import java.time.LocalDateTime;
import java.util.UUID;

public record Transaction(
        UUID transactionId,
        String accountNumber,
        TransactionType type,
        double amount,
        LocalDateTime timestamp
) {
    public static Transaction create(String accountNumber, TransactionType type, double amount) {
        return new Transaction(UUID.randomUUID(), accountNumber, type, amount, LocalDateTime.now());
    }
}