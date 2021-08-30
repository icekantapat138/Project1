package ku.cs.model.user;

public class Account {

    private  String username, password;
    private Account admin;

    public Account(){
        this.username = "Admin";
        this.username = "Admin1234";
    }

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    public boolean checkUser(String user){
        return username.equals(user);
    }

    public boolean checkPass(String pw){
        return password.equals(pw);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }

    public void setAdmin(Account admin) {
        this.admin = admin;
    }
}
