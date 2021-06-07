package za.ac.cput.Entity.Factory;

import za.ac.cput.Entity.Customer;

public class CustomerFactory
{
    
    public static Customer createCustomer(int customerID, String name, String surname, String emailAddress,
                                          String homeAddress, long phoneNumber)
{
    Customer customer = new Customer.Builder()
            .setCustomerID(customerID)
            .setName(name)
            .setSurname(surname)
            .setEmailAddress(emailAddress)
            .setHomeAddress(homeAddress)
            .setPhoneNumber(phoneNumber)
            .build();

    return customer;
}

}
