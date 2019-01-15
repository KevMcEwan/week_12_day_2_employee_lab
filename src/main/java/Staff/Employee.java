package Staff;

public abstract class Employee {
    private String name;
    private String NInumber;
    private Double salary;

    public Employee(String name, String NInumber, Double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public Double getSalary() {
        return salary;
    }

    public Double raiseSalary(Double percentageIncrease){
        if(percentageIncrease >= 0.00) {
            this.salary = this.salary * (1 + (percentageIncrease / 100));
        }
        return this.salary;
    }

    public Double payBonus(){
        return 0.01 * this.salary;
    }
}
