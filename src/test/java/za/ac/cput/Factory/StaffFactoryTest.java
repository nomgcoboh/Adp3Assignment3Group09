package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Staff;

public class StaffFactoryTest {

    //Attributes
    Staff staff;

    @Test
    public void createStaff()
    {
        Staff staff = StaffFactory.createStaff (10478,"Nomgcobo","Hlwempu");
        System.out.println(staff);
    }

}
