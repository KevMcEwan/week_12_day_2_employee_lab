package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String deptName, String name, String NInumber, Double salary){
        super(name, NInumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
