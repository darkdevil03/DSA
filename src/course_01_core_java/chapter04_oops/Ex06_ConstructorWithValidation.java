package course_01_core_java.chapter04_oops;

/*

 */

    class Account{
        private final String accountNumber;
        private final double balance;

        public Account(String accountNumber, double balance){

            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void getAccountNumber() {
            if(this.accountNumber == null || this.accountNumber.isEmpty()){
                System.out.println("Error: Account number cannot be null or empty.");
            }else{
                System.out.println("Account number: " + this.accountNumber);
            }
        }
        public void getBalance() {
            if(this.balance < 0){
                System.out.println("Error: Balance cannot be negative.");
            }else if( this.accountNumber == null || this.accountNumber.isEmpty()){
                System.out.println("Error: No balance found due to account number not valid.");
            }
            else{
                System.out.println("Balance: " + this.balance);
            }
        }
    }

    public class Ex06_ConstructorWithValidation {
        public static void main(String[] args) {
            Account account = new Account(null, 5000);
            account.getAccountNumber();
            account.getBalance();

            Account account1 = new Account("123", 5000);
            account1.getAccountNumber();
            account1.getBalance();

            Account account2 = new Account("456", -11);
            account2.getAccountNumber();
            account2.getBalance();
        }
    }
