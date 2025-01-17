package kosa.bank;

public class Customer {
    private String id;
    private String name;
    private Account account;

    public Customer() {

    }
    // 수정함
    public Customer(String id, String name, long balance) {
        super();
        this.id = id;
        this.name = name;
        this.account = new Account(id,balance);  // 해당 고객의 계좌(수정)
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
