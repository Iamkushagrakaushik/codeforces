public class Bank {
    static Bank bank;
    String name;
    int balance;
    int accno;
    public boolean isStringInt(String s)
{
    try
    {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException ex)
    {
        return false;
    }
}
static boolean validateName(String name) {
    if (name == null || name.length() < 2 || name.length() > 50) {
        return false; 
    }
    
    boolean lastWasSpace = false;  
    
    for (int i = 0; i < name.length(); i++) {
        char ch = name.charAt(i);

         
        if (!Character.isLetter(ch) && ch != ' ') {
            return false;
        }
        
         
        if (ch == ' ') {
            if (lastWasSpace) {
                return false;  
            }
            lastWasSpace = true;
        } else {
            lastWasSpace = false;
        }
    }

    
    return name.charAt(0) != ' ' && name.charAt(name.length() - 1) != ' ';
}
    private Bank(String name,int balance ,int accno){
        this.name=name;
        this.balance=balance;

        this.accno=accno;

    }

    static  Bank createBank(String name,int balance,int accno) {
    if (bank==null){

        bank= new Bank( name, balance,accno);

        
    }
    return bank;
}
    int withdraw(String amoun){
        if (isStringInt(amoun)){
            int amount=Integer.parseInt(amoun);
         
        if (amount>this.balance){
            System.out.println("Insufficient balance to withdraw");
            return 0;
        }
        this.balance-=amount;
        System.out.println("Withdrawl successful");
        return 1;}
        return 0;
    }
    int depo(String amount){
        if (isStringInt(amount)){
            this.balance+=Integer.parseInt(amount);
            return 1;

        }
        return 0;

    }
    int changeName(String nam){
        if (validateName(nam)){
            this.name=nam;
            return 1;

        }
        return 0;

    }
    void passbook(){
        System.out.println("Customer name  =="+this.name );
        System.out.println("your account number   "+this.accno);
        System.out.println("Current balance   "+this.balance);

    }
    public static void main(String[] args) {
        Bank bank=Bank.createBank("kushagra", 02000, 0234352);
        bank.passbook();
        bank.changeName("java");
        bank.withdraw("1400");
        bank.depo("1425");
        bank.passbook();

    }
}