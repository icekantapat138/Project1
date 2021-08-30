package ku.cs.service.fileaccount;

import ku.cs.model.user.Account;
import ku.cs.model.user.CustomerAccount;

public interface AccountData {

    Account getAdminData();
    CustomerAccount getCustomerData();

    void writDataSource(Account acc);
}
