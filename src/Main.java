public class Main {
    public static void main(String[] args) {
        Employee robert = new Employee("Robert", "12/01/2002", "22/06/2023");
        System.out.println(robert);
        System.out.println("Age = " + robert.getAge());
        System.out.println("Pay = " + robert.collectPay());

        System.out.println();

        SalariedEmployee denisa = new SalariedEmployee("Denisa", "01/09/2001", "30/06/2023", 30000);
        System.out.println(denisa);
        System.out.println("Denisa paycheck = $" + denisa.collectPay());

        denisa.retire();
        System.out.println("Denisa's Pension chekc = "+ denisa.collectPay() );

        System.out.println();

        HourlyEmployee berry = new HourlyEmployee("Berry", "08/06/2000", "03/03/2021", 15);
        System.out.println(berry);
        System.out.println("Berry's paycheck = $" + berry.collectPay());
        System.out.println("berry's Holiday Pay = $" + berry.getDoublePay() );
    }
}