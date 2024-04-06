package OOPS;

public class AccessModi {
    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Om";
        myAcc.setpasssword("abcd");
        System.out.println(myAcc.username);
    }
}

class BankAccount{
    public String username;
    private String password;
    void setpasssword(String pass){
        password = pass;
        System.out.println(password);
    }
}
