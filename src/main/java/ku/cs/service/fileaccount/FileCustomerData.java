package ku.cs.service.fileaccount;

import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;

import java.io.*;

public class FileCustomerData implements AccountData{

    private String fileDirectoryName;
    private String fileName;
    private CustomerAccount customerAcc;

    public FileCustomerData(String fileDirectoryName, String fileName){
        this.fileDirectoryName = fileDirectoryName;
        this.fileName = fileName;
        checkFieldExist();
    }

    private void checkFieldExist() {
        File file = new File(fileDirectoryName);
        if (!file.exists()){
            file.mkdirs();
        }

        String filePath = fileDirectoryName + File.separator + fileName;
        file = new File(filePath);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Cannot create " + filePath);
            }
        }
    }

    private void readStaffData() throws IOException {
        String filePath = fileDirectoryName + File.separator + fileName;
        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            CustomerAccount customer = new CustomerAccount();

            customerAcc.addAccCustomer(customer);
        }
        reader.close();
    }

    @Override
    public Account getAdminData() {
        return null;
    }

    @Override
    public CustomerAccount getCustomerData() {
        try {
            customerAcc = new CustomerAccount();
            readStaffData();
        } catch (FileNotFoundException e) {
            System.err.println(this.fileName + " not found");
        } catch (IOException e) {
            System.err.println("IOException from reading " + this.fileName);
        }
        return customerAcc;
    }

    @Override
    public void writDataSource(Account acc) {

    }
}
