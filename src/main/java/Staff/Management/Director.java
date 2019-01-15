package Staff.Management;

public class Director extends Manager {
    private Double budget;

    public Director(Double budget, String deptName, String name, String NInumber, Double salary){
        super(deptName, name, NInumber, salary);
        this.budget = budget;
    }

    public Double getBudget(){
        return budget;
    }

    public Double payBonus(){
        return 0.02 * super.getSalary();
    }

    public void changeNI(String newNI){
        super().NInumber = newNI;
    }
}
