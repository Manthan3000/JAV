class Account {
    public String name;
    public String email;
    private String password; // Private

    // for access private getter & setters
    public String getpassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass; // ABCDE
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Manthan";
        account1.email = "manthanovhal695@gmail.com";
        account1.setPassword("ABCDE");
        System.out.println(account1.getpassword());
    }
}

// ACCESS MODIFIER
