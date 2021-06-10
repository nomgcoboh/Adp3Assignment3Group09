package za.ac.cput.Factory;

/*
    AdoptionRecordFactory.java
    AdoptionRecordFactory class for the AdoptionRecord entity
    Author: Siyanda Hlongwa (217091229)
    Date: 05 June 2021
 */


import za.ac.cput.Entity.AdoptionRecord;
import za.ac.cput.Util.GenericHelper;

import java.util.Date;

public class AdoptionRecordFactory {//start of AdoptionRecordFactory class


    public static AdoptionRecord createAdoptionRecord( int dogId, int customerId, int staffId, Date date)
    {
        String adoptionRecordId = GenericHelper.generateId();
        return new AdoptionRecord.Builder()
                .setAdoptionId(adoptionRecordId)
                .setDogId(dogId)
                .setCustomerId(customerId)
                .setStaffId(staffId)
                .setDate(date)
                .build();
    }

}//end of AdoptionRecordFactory class
