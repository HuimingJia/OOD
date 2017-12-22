package PersonalBudget;

import java.util.ArrayList;

public class User {
    String userName;
    String address;
    String account;
    String password;

    ArrayList<Account> accounts = new ArrayList<>();

    public ArrayList<Transaction> getTransctionByCategory(Category c) {
        return new ArrayList<Transaction>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public int getExpenseByCategory() {
        return 0;
    }

    public int getExpenseByAccount() {
        return 0;
    }

    public boolean addExpense() {
        return true;
    }

}
