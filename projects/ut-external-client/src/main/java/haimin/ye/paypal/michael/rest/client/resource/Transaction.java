package haimin.ye.paypal.michael.rest.client.resource;

import java.math.BigInteger;

public class Transaction {
    private long id;
    private BigInteger payment_activity_id;
    private long time_created;
    private long time_event_published;
    private long parent_id;
    private String transaction_type;
    private String transaction_subtype;
    private String memo;
    private long counterparty_account_number;
    private String status;
    private String funding_type;
    private String funding_subtype;
    private String counterparty_alias;
    private long amount;
    private String amount_currency_code;
    private long amount_usd;
    private String is_correction;
    private String transaction_direction;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public BigInteger getPayment_activity_id() {
        return payment_activity_id;
    }
    public void setPayment_activity_id(BigInteger payment_activity_id) {
        this.payment_activity_id = payment_activity_id;
    }
    public long getTime_created() {
        return time_created;
    }
    public void setTime_created(long time_created) {
        this.time_created = time_created;
    }
    public long getTime_event_published() {
        return time_event_published;
    }
    public void setTime_event_published(long time_event_published) {
        this.time_event_published = time_event_published;
    }
    public long getParent_id() {
        return parent_id;
    }
    public void setParent_id(long parent_id) {
        this.parent_id = parent_id;
    }
    public String getTransaction_type() {
        return transaction_type;
    }
    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }
    public String getTransaction_subtype() {
        return transaction_subtype;
    }
    public void setTransaction_subtype(String transaction_subtype) {
        this.transaction_subtype = transaction_subtype;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public long getCounterparty_account_number() {
        return counterparty_account_number;
    }
    public void setCounterparty_account_number(long counterparty_account_number) {
        this.counterparty_account_number = counterparty_account_number;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getFunding_type() {
        return funding_type;
    }
    public void setFunding_type(String funding_type) {
        this.funding_type = funding_type;
    }
    public String getFunding_subtype() {
        return funding_subtype;
    }
    public void setFunding_subtype(String funding_subtype) {
        this.funding_subtype = funding_subtype;
    }
    public String getCounterparty_alias() {
        return counterparty_alias;
    }
    public void setCounterparty_alias(String counterparty_alias) {
        this.counterparty_alias = counterparty_alias;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public String getAmount_currency_code() {
        return amount_currency_code;
    }
    public void setAmount_currency_code(String amount_currency_code) {
        this.amount_currency_code = amount_currency_code;
    }
    public long getAmount_usd() {
        return amount_usd;
    }
    public void setAmount_usd(long amount_usd) {
        this.amount_usd = amount_usd;
    }
    public String getIs_correction() {
        return is_correction;
    }
    public void setIs_correction(String is_correction) {
        this.is_correction = is_correction;
    }
    public String getTransaction_direction() {
        return transaction_direction;
    }
    public void setTransaction_direction(String transaction_direction) {
        this.transaction_direction = transaction_direction;
    }
    @Override
    public String toString() {
        return "Transaction [id=" + id + ", payment_activity_id=" + payment_activity_id + ", time_created="
                + time_created + ", time_event_published=" + time_event_published + ", parent_id=" + parent_id
                + ", transaction_type=" + transaction_type + ", transaction_subtype=" + transaction_subtype + ", memo="
                + memo + ", counterparty_account_number=" + counterparty_account_number + ", status=" + status
                + ", funding_type=" + funding_type + ", funding_subtype=" + funding_subtype + ", counterparty_alias="
                + counterparty_alias + ", amount=" + amount + ", amount_currency_code=" + amount_currency_code
                + ", amount_usd=" + amount_usd + ", is_correction=" + is_correction + ", transaction_direction="
                + transaction_direction + "]";
    }
    
}
