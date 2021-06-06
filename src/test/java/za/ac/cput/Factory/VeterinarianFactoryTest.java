package za.ac.cput.Factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Veterinarian;


class VeterinarianFactoryTest {

    @Test
    public void createVeterinarian()
    {
        Veterinarian veterinarian = VeterinarianFactory.createVeterinarian("Nonhlahla", "Hlungwani", 0720657472, "218160658@mycput.ac.za");
        System.out.println(veterinarian);
    }
}