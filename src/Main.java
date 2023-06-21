public class Main {
    public static void main(String[] args) {
        Employee robert = new Employee("Robert", "12/01/2002", "22/06/2023");
        System.out.println(robert);
        System.out.println("Age = " + robert.getAge());
        System.out.println("Pay = " + robert.collectPay());

        Employee denisa = new Employee("Denisa", "01/09/2001", "30/06/2023");
        System.out.println(denisa);
        System.out.println("Age = " + denisa.getAge());
        System.out.println("Pay = " + denisa.collectPay());
    }
}