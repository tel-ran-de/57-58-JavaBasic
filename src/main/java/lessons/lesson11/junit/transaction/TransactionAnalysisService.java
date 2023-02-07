package lessons.lesson11.junit.transaction;



import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .toList();
    }

    public List<Transaction> sortTransactionsByValueIncrease(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }

    public List<Transaction> sortTransactionsByValueDecrease(List<Transaction> transactions){
        return  transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .toList();
    }

    public List<Transaction> sortTransactionsByYearAndValueIncrease(List<Transaction> transactions, int year){
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }

    public List<Integer> findTransactionYear(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .toList();
    }

    public List<Integer> findTransactionUniqueYear(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Trader> findUniqueTraders(List<Transaction> traders){
        return traders.stream()
                .map(Transaction::getTrader)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTradersCities(List<Transaction> traders){
        return traders.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTraderNamesByCity(List<Transaction> traders, String city){
        return traders.stream()
                .filter(t -> t.getTrader().getCity().equals(city))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

}
