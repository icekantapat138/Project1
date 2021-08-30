package ku.cs.model.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CustomerAccount extends Account {
    private String firstname, lastname, username;
    private String time;
    private ArrayList<CustomerAccount> customerAccounts;
    private String status;
    private int count;

    public CustomerAccount(){
        customerAccounts = new ArrayList<>();
    }

    public CustomerAccount(String username,String password, String firstname, String lastname, String time, String status, int count) {
        super(username, password);
        this.firstname = firstname;
        this.lastname = lastname;
        this.time = time;
        this.status = status;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = 0;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public int getCount() {
        return count;
    }

    public void setStatusOnline(){
        this.status = "Online";
    }

    public void setStatusOffline() {
        this.status = "Offline";
    }

    public String setStatus() {return status;}

    public void addAccCustomer(CustomerAccount customer) {customerAccounts.add(customer);}

    public void setDate(){
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd.MMM.yyyy kk:mm:ss");
        String time = formatTime.format(currentTime);
        this.time = time;
    }

    public boolean searchUser(String user){return customerAccounts.toString().contains(user);}

    public boolean searchPassword(String pw){return customerAccounts.toString().contains(pw);}

    public String getFirstname() {return firstname;}

    public String getLastname() {return lastname;}

    public String getTime() {
        return time;
    }

    public ArrayList<CustomerAccount> getCustomerAccounts() {
        return customerAccounts;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomerAccounts(ArrayList<CustomerAccount> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", time='" + time + '\'' +
                ", customerAccounts=" + customerAccounts +
                ", status='" + status + '\'' +
                ", count=" + count +
                '}';
    }
}