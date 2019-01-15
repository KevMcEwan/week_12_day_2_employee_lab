import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager1;

    @Before
    public void before(){
        manager1 = new Manager("Ministry of Silly Walks", "Alana Bob", "XK121314D", 25000.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Ministry of Silly Walks", manager1.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Alana Bob", manager1.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("XK121314D", manager1.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager1.raiseSalary(10.00);
        assertEquals(27500.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryIfNegativePercent(){
        manager1.raiseSalary(-10.00);
        assertEquals(25000.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250.00, manager1.payBonus(), 0.01);
    }
}
