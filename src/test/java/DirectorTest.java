import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director1;

    @Before
    public void before(){
        director1 = new Director(1000000.00,"Ministry of Silly Walks", "Bob Alana", "XK121314D", 56000.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Ministry of Silly Walks", director1.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Bob Alana", director1.getName());
    }

    @Test
    public void canGetNInumber(){
        assertEquals("XK121314D", director1.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(56000.00, director1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director1.raiseSalary(10.00);
        assertEquals(61600.00, director1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1120.00, director1.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000.00, director1.getBudget(), 0.01);
    }
}