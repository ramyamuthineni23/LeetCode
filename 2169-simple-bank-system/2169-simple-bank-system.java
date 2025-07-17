class Bank {
    private long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean isvalid(int account) {
        return account >=1 && account <= balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(isvalid(account1) && isvalid(account2) && balance[account1 - 1] >= money) {
            balance[account1 - 1] -= money;
            balance[account2 - 1] += money;
            return true;
        }  
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(isvalid(account)) {
            balance[account - 1] += money;
            return true;
        }
        return false;   
    }
    
    public boolean withdraw(int account, long money) {
        if(isvalid(account) && balance[account - 1] >= money) {
            balance[account - 1] -= money;
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */