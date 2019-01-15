import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer("Roy", "AB102030F", 27000.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Roy", developer1.getName());
    }
    @Test
    public void developerHasNINumber(){
        assertEquals("AB102030F", developer1.getNInumber());
    }
    @Test
    public void developerHasSalary(){
        assertEquals(27000.00, developer1.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(10.00);
        assertEquals(29700.00, developer1.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(270.00, developer1.payBonus(), 0.01);
    }
}
