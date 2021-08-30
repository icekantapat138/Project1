package ku.cs.service.fileaccount;

import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;

import java.io.*;

public class FileAdminData implements AccountData{

    private String fileDirectoryName;
    private String fileName;
    private Account admin;

    public FileAdminData(String fileDirectoryName, String fileName){
        this.fileDirectoryName = fileDirectoryName;
        this.fileName = fileName;
        checkFileIsExisted();
    }

    private void checkFileIsExisted() {
        File file = new File(fileDirectoryName);
        if (!file.exists()) {
            file.mkdirs();
        }
        String filePath = fileDirectoryName + File.separator + fileName;
        file = new File(filePath);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e){
                System.err.println("Cannot create " + filePath);
            }
        }
    }

    private void readAdminData() throws IOException{
        String filePath = fileDirectoryName + File.separator + fileName;
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "";
        while((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            admin.setPassword(data[2]);
        }
        reader.close();
    }

    @Override
    public Account getAdminData() {
        return null;
    }

    @Override
    public CustomerAccount getCustomerData() {
        return null;
    }

    @Override
    public void writDataSource(Account acc){
        String filePath = fileDirectoryName + File.separator + fileName;
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            String line = "admin" + "," + acc.getUsername() + acc.getUsername() + "," +acc.getPassword();

            writer.append(line);
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            System.err.println("Cannot write " + filePath);
        }

    }
}
