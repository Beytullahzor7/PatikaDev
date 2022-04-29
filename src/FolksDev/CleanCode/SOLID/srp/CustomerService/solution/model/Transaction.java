package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model;

import java.io.Serializable;
import java.sql.Timestamp;

public abstract class Transaction implements Comparable, Serializable {

    protected int no;
    protected double amount;
    protected Timestamp date;
    protected static String description;
    protected TransactionType type;

    protected Account source;

    public Transaction(int no, double amount, Timestamp date, Account source, TransactionType type) {
        this.no = no;
        this.amount = amount;
        this.date = date;
        this.source = source;
        this.type = type;
    }

    public Transaction(int no, double amount, Timestamp date, Account source, TransactionType type, String description) {
        this.no = no;
        this.amount = amount;
        this.date = date;
        this.source = source;
        this.description = description;
        this.type = type;
    }

    /**
     * Since db inserts a no when creating a new Transaction in the db, no need to supply it.
     *
     * @param amount
     * @param date
     * @param source
     */
    public Transaction(double amount, Timestamp date, Account source, TransactionType type) {
        this.amount = amount;
        this.date = date;
        this.source = source;
        this.type = type;
    }

    public Transaction(double amount, Timestamp date, Account source, String description, TransactionType type) {
        this.amount = amount;
        this.date = date;
        this.source = source;
        this.description = description;
        this.type = type;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Account getSource() {
        return source;
    }

    public void setSource(Account source) {
        this.source = source;
    }

    public static String getDescription() {
        System.out.println("getDescription(): " + description);
        return description;
    }

    public static void setDescription(String description) {
        Transaction.description = description;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    /**
     * Overrides compareTo() method to decide which Transaction happened first.
     */
    @Override
    public int compareTo(Object object) {
        int comparision = 0;
        if (object instanceof Transaction) {
            Transaction tx = (Transaction) object;
            long myTime = date.getTime();
            long herTime = tx.getDate().getTime();
            if (myTime < herTime)
                comparision = -1;
            else if (myTime == herTime)
                comparision = 0;
            else
                comparision = 1;
        }
        return comparision;
    }

    @Override
    public String toString() {
        return "Transaction [no=" + no + ", amount=" + amount + ", date=" + date + ", type=" + type + ", source="
                + source + "]";
    }
}