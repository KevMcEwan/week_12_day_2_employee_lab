import Staff.TechStaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin1;

    @Before
    public void before(){
        databaseAdmin1 = new DatabaseAdmin("Roy", "AB102030F", 27000.00);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Roy", databaseAdmin1.getName());
    }
    @Test
    public void databaseAdminHasNINumber(){
        assertEquals("AB102030F", databaseAdmin1.getNInumber());
    }
    @Test
    public void databaseAdminHasSalary(){
        assertEquals(27000.00, databaseAdmin1.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin1.raiseSalary(10.00);
        assertEquals(29700.00, databaseAdmin1.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(270.00, databaseAdmin1.payBonus(), 0.01);
    }
}