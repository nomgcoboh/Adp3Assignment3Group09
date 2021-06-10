package za.ac.cput.Util;
/*
    GenericHelper.java
    GenericHelper class for the AdoptionRecord entity
    Author: Siyanda Hlongwa (217091229)
    Date: 05 June 2021
 */
import java.util.UUID;

public class GenericHelper {
    public static String generateId(){

        return UUID.randomUUID().toString();
    }
}
