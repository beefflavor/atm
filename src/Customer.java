import java.util.Scanner;
/**
 *
 */
public class Customer {
    private String name;
    private int balance;
    private Scanner input = new Scanner(System.in);


    public Customer(int balance) {
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }


    public void enterName() throws Exception {
        System.out.println("what is your name?");
        this.name = input.nextLine();
        if (name.isEmpty()) {
            throw new Exception("nothing entered");
        }
    }


    public void chooseTask() throws Exception {
        System.out.println("what would you like to do? [a] check balance [b] withdraw funds [c] cancel ");
        String task = input.nextLine();

        if (task.equalsIgnoreCase("a")) {
            this.printBalance();
        } else if (task.equalsIgnoreCase("b")) {
            takeMoney();
        } else if (task.equalsIgnoreCase("c")){
            System.out.format("Thank you and please come again.");
        }
    }




public void printBalance(){
    System.out.format("Your balance is $%s", balance);
}


    public void takeMoney() throws Exception {
        System.out.println("how much would you like to withdraw");
        int amount = Integer.parseInt(this.input.nextLine());
        if (amount > 100) {
            throw new Exception("that amount is too much");
        }
        this.balance -= amount;
        System.out.format("your remaining balance is $%s\nPlease take your money", balance);

}
}

