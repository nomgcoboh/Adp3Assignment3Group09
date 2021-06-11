package za.ac.cput.Factory;


import za.ac.cput.Entity.Veterinarian;

/*
    VeterinarianFactory.java
    Factory for the Veterinarian
    Author: Nonhlahla Hlungwani (218160658)
    Date: 05 June 2021
 */
public class VeterinarianFactory {
    private static int vetID =30;


    public Veterinarian createVeterinarian(String name , String surname, long phoneNumber, String emailAddress) {

            return new Veterinarian.Builder()
                .setVetId(++vetID)
                .setName(name)
                .setSurname(surname)
                .setPhoneNumber(phoneNumber)
                .setEmailAddress(surname)
                .build();


    }



}
