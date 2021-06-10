package za.ac.cput.Factory;
/*
    AdoptionRecordFactoryTest.java
    Class for the AdoptionRecordTestFactory
    Author: Siyanda Hlongwa (217091229)
    Date: 05 June 2021
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.AdoptionRecord;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AdoptionRecordFactoryTest {
    private Date date= new Date();
    @Test
    public void createAdoptionRecord(){

        AdoptionRecord adoptionRecord1 = AdoptionRecordFactory.createAdoptionRecord(1001, 123456, 987654, date);
        AdoptionRecord adoptionRecord2 = AdoptionRecordFactory.createAdoptionRecord(1002, 258085, 794613, date);


        System.out.print(adoptionRecord1+ "\n");
        System.out.print(adoptionRecord2);
    }


}