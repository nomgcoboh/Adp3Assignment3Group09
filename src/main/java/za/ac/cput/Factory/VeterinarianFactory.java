package za.ac.cput.Factory;


import za.ac.cput.Entity.Veterinarian;

import java.util.UUID;


/*
    VeterinarianFactory.java
    Factory for the Veterinarian
    Author: Nonhlahla Hlungwani (218160658)
    Date: 05 June 2021
 */
public class VeterinarianFactory {
    private static int vetID = 234;

    public static Veterinarian createVeterinarian(String name , String surname, long phoneNumber, String emailAddress) {

        Veterinarian veterinarian = new Veterinarian.Builder()
                .setVetId(++vetID)
                .setName(name)
                .setSurname(surname)
                .setPhoneNumber(phoneNumber)
                .setEmailAddress(surname)
                .build();
        return veterinarian;
    }


}
