package d01.ex03;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private User recipient;
    private User sender;
    private Category category;
    private int amount;
    private Status status;

    private enum Category {
        DEBIT,
        CREDIT
    }

    private enum Status {
        FAIL,
        SUCCESS
    }

    public Transaction(User sender, User recipient, int amount) {
        if ((amount > 0) && sender.getBalance() > amount) {
            setSender(sender);
        }

    }

    private void setId() {
        this.id = new UUID(0xfa,0xaf);
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setCategory(Category category) {
        this.category = (this.amount > 0) ? Category.DEBIT : Category.CREDIT;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Status checkStatusTransaction() {
        return Status.SUCCESS;
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
}
