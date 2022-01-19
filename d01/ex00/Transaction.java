package d01.ex00;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private User recipient;
    private User sender;
    private Category category;
    private int amount;
    private Status status;

    private enum Category {
        DEBET,
        CREDIT
    }

    private enum Status {
        FAIL,
        SUCCESS
    }

    public Transaction(User sender, User recipient, int amount) {
        setId();
        setSender(sender);
        setRecipient(recipient);
        setAmount(amount);
        setCategory(amount);
        checkStatusTransaction();
        if (status == Status.SUCCESS) {
            completeTransaction();
        }
    }

    private void setId() {
        this.id = UUID.randomUUID();
    }

    private void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    private void setSender(User sender) {
        this.sender = sender;
    }

    private void setCategory(int amount) {
        this.category = (amount < 0) ? Category.DEBET : Category.CREDIT;
    }

    private void setAmount(int amount) {
        this.amount = (amount > 0) ? amount : -amount;
    }

    private Status checkStatusTransaction() {
        status = Status.FAIL;
        if (this.category == Category.DEBET) {
            if (sender.getBalance() - amount >= 0) {
                status = Status.SUCCESS;
            }
        } else {
            if (recipient.getBalance() - amount >= 0) {
                status = Status.SUCCESS;
            }
        }
        return status;
    }

    private void completeTransaction() {
        if (category == Category.DEBET) {
            sender.incBalance(-amount);
            recipient.incBalance(amount);
        } else {
            sender.incBalance(amount);
            recipient.incBalance(-amount);
        }
    }

    public UUID getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public int getAmount() {
        return amount;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                sender.getName() + " -> " +
                recipient.getName() +
                ", " + amount + ", " +
                ((category == Category.DEBET) ? "OUTCOME" : "INCOME") +
                ", " + id + "}";
    }
}
