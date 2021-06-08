/*CustomerFactoryTest.java
Test for the CustomerFactory
Author:Andy William Hine (219259038)
Date:07 June 2021
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest
{
    @Test
    public void createCustomer()
    {
        Customer customer = CustomerFactory.createCustomer(12334,"John","Carter",
                "Carter8282@gmail.com","1 Boem straat",566903772);
        System.out.println(customer);
    }


}