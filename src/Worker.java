public class Worker {
    private final String name;
    private final String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        // year format is dd/mm/yyyy

        int presentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return presentYear-birthYear;
    }

    public double collectPay(){
        return 0.00;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
