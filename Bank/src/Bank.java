class Account{
    public String name;
    protected String email;
    private String password;


    //getters ans setters
    public String getPassword(){
        return this.password;

    }

    public  void setPassword(String pass){
        this.password = pass;
    }

}
public class Bank {
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="prathvi";
        acc1.email="prathvi@gmail.com";
        acc1.setPassword("pass");
        System.out.println(acc1.getPassword());
    }
}