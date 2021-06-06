package za.ac.cput.Factory;


/*
    VeterinarianFactoryTest.java
    Factory Test for the Veterinarian
    Author: Nonhlahla Hlungwani (218160658)
    Date: 05 June 2021
 */
import org.junit.jupiter.api.Test;

import za.ac.cput.Entity.Veterinarian;


class VeterinarianFactoryTest {


    @Test
    public void createVeterinarian()
    {
        Veterinarian veterinarian = new VeterinarianFactory().createVeterinarian("Nonhlahla", "Hlungwani", 0720657472, "218160658@mycput.ac.za");
        System.out.println(veterinarian);
    }
}