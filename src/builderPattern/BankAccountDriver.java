package builderPattern;

public class BankAccountDriver {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount.Builder().setAccountHolder("Arunendra Singh").setAccountNumber(1001001001L).setBankName("HDFC Bank").setBalance(75000.00).setAccountType("Savings").setBranch("Lucknow").build();

        BankAccount ba2 = new BankAccount.Builder().setAccountHolder("Rahul Sharma").setAccountNumber(1001001002L).setBankName("State Bank of India").setBalance(85000.00).setAccountType("Current").setBranch("Delhi").build();

        BankAccount ba3 = new BankAccount.Builder().setAccountHolder("Amit Verma").setAccountNumber(1001001003L).setBankName("ICICI Bank").setBalance(95000.00).setAccountType("Savings").setBranch("Noida").build();

        BankAccount ba4 = new BankAccount.Builder().setAccountHolder("Priya Singh").setAccountNumber(1001001004L).setBankName("Axis Bank").setBalance(65000.00).setAccountType("Salary").setBranch("Kanpur").build();

        BankAccount ba5 = new BankAccount.Builder().setAccountHolder("Rohit Kumar").setAccountNumber(1001001005L).setBankName("Punjab National Bank").setBalance(55000.00).setAccountType("Savings").setBranch("Agra").build();

        BankAccount ba6 = new BankAccount.Builder().setAccountHolder("Neha Gupta").setAccountNumber(1001001006L).setBankName("Bank of Baroda").setBalance(105000.00).setAccountType("Current").setBranch("Jaipur").build();

        BankAccount ba7 = new BankAccount.Builder().setAccountHolder("Vikas Yadav").setAccountNumber(1001001007L).setBankName("Kotak Mahindra Bank").setBalance(45000.00).setAccountType("Savings").setBranch("Mumbai").build();

        BankAccount ba8 = new BankAccount.Builder().setAccountHolder("Anjali Mishra").setAccountNumber(1001001008L).setBankName("IndusInd Bank").setBalance(125000.00).setAccountType("Salary").setBranch("Pune").build();

        BankAccount ba9 = new BankAccount.Builder().setAccountHolder("Suresh Patel").setAccountNumber(1001001009L).setBankName("Union Bank of India").setBalance(35000.00).setAccountType("Savings").setBranch("Ahmedabad").build();

        BankAccount ba10 = new BankAccount.Builder().setAccountHolder("Pooja Sharma").setAccountNumber(1001001010L).setBankName("Canara Bank").setBalance(150000.00).setAccountType("Current").setBranch("Bangalore").build();

        BankAccount ba11 = new BankAccount.Builder().setAccountHolder("Aakash Gupta").setAccountNumber(1001001011L).setBankName("HDFC Bank").setBalance(92000.00).setAccountType("Savings").setBranch("Gurugram").build();

        BankAccount ba12 = new BankAccount.Builder().setAccountHolder("Sneha Verma").setAccountNumber(1001001012L).setBankName("ICICI Bank").setBalance(78000.00).setAccountType("Salary").setBranch("Hyderabad").build();

        BankAccount ba13 = new BankAccount.Builder().setAccountHolder("Manish Kumar").setAccountNumber(1001001013L).setBankName("Axis Bank").setBalance(115000.00).setAccountType("Current").setBranch("Chennai").build();

        BankAccount ba14 = new BankAccount.Builder().setAccountHolder("Kavita Singh").setAccountNumber(1001001014L).setBankName("State Bank of India").setBalance(62000.00).setAccountType("Savings").setBranch("Varanasi").build();

        BankAccount ba15 = new BankAccount.Builder().setAccountHolder("Deepak Mishra").setAccountNumber(1001001015L).setBankName("Punjab National Bank").setBalance(88000.00).setAccountType("Salary").setBranch("Prayagraj").build();

        BankAccount ba16 = new BankAccount.Builder().setAccountHolder("Ritu Sharma").setAccountNumber(1001001016L).setBankName("Kotak Mahindra Bank").setBalance(135000.00).setAccountType("Savings").setBranch("Indore").build();

        BankAccount ba17 = new BankAccount.Builder().setAccountHolder("Karan Singh").setAccountNumber(1001001017L).setBankName("Bank of Baroda").setBalance(72000.00).setAccountType("Current").setBranch("Bhopal").build();

        BankAccount ba18 = new BankAccount.Builder().setAccountHolder("Meena Gupta").setAccountNumber(1001001018L).setBankName("Canara Bank").setBalance(98000.00).setAccountType("Savings").setBranch("Patna").build();

        BankAccount ba19 = new BankAccount.Builder().setAccountHolder("Rakesh Yadav").setAccountNumber(1001001019L).setBankName("Union Bank of India").setBalance(58000.00).setAccountType("Salary").setBranch("Ranchi").build();

        BankAccount ba20 = new BankAccount.Builder().setAccountHolder("Simran Kaur").setAccountNumber(1001001020L).setBankName("IndusInd Bank").setBalance(165000.00).setAccountType("Savings").setBranch("Chandigarh").build();

        System.out.println(ba1);
        System.out.println("====================");

        System.out.println(ba2);
        System.out.println("====================");

        System.out.println(ba3);
        System.out.println("====================");

        System.out.println(ba4);
        System.out.println("====================");

        System.out.println(ba5);
        System.out.println("====================");

        System.out.println(ba6);
        System.out.println("====================");

        System.out.println(ba7);
        System.out.println("====================");

        System.out.println(ba8);
        System.out.println("====================");

        System.out.println(ba9);
        System.out.println("====================");

        System.out.println(ba10);
        System.out.println("====================");

        System.out.println(ba11);
        System.out.println("====================");

        System.out.println(ba12);
        System.out.println("====================");

        System.out.println(ba13);
        System.out.println("====================");

        System.out.println(ba14);
        System.out.println("====================");

        System.out.println(ba15);
        System.out.println("====================");

        System.out.println(ba16);
        System.out.println("====================");

        System.out.println(ba17);
        System.out.println("====================");

        System.out.println(ba18);
        System.out.println("====================");

        System.out.println(ba19);
        System.out.println("====================");

        System.out.println(ba20);
        
    }
}



