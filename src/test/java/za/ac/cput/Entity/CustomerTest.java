/*CustomerTest.java
Test for the Customer
Author:Andy William Hine (219259038)
Date:07 June 2021
 */

package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest
{
    //Attributes
    Customer.Builder customer1;
    Customer.Builder customer2;

    @BeforeEach
    void setUp() {

        customer1 = new Customer.Builder().setCustomerID(12).setName("Eugene").setSurname("Witbooi")
                .setEmailAddress("geneW@gmail.com").setHomeAddress("56 Uitzight laan/ Covid city ").setPhoneNumber(563790123);
        customer2 = new Customer.Builder().setCustomerID(90).setName("Jan").setSurname("Jaakobs")
                .setEmailAddress("Jan14@gmail.com").setHomeAddress("46 Knorr/ Covid city ").setPhoneNumber(784359278);
    }

    @Test
    public void testDog()
    {
        System.out.println("customer1: " + customer1.toString());
        System.out.println("customer2: " + customer2.toString());
    }

}