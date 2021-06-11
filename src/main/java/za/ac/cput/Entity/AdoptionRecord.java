package za.ac.cput.Entity;

import java.util.Date;

/*
    AdoptionRecord.java
    Entity for the AdoptionRecord
    Author: Siyanda Hlongwa (217091229)
    Date: 04 June 2021
 */

public class AdoptionRecord {// start of AdoptionRecord class

    //Attributes
    private int adoptionId;
    private int dogId;
    private int customerId;
    private int staffId;
    private Date date;

    //Constructor
    public AdoptionRecord(Builder builder)
    {
        this.adoptionId = builder.adoptionId;
        this.customerId = builder.customerId;
        this.date = builder.date;
        this.dogId = builder.dogId;
        this.staffId = builder.staffId;
    }
    public AdoptionRecord() {

    }

    //toString method
    @Override
    public String toString() {
        return "AdoptionRecord{" +
                "adoptionId=" + adoptionId +
                ", dogId=" + dogId +
                ", customerId=" + customerId +
                ", staffId=" + staffId +
                ", date=" + date +
                '}';
    }

    //Builder class
    public static class Builder {

        //Attributes
        private int adoptionId;
        private int customerId;
        private Date date;
        private int dogId;
        private int staffId;

        //Builder initialisation
        public Builder setAdoptionId(int adoptionId) {
            this.adoptionId = adoptionId;
            return this;
        }

        public Builder setDogId(int dogId) {
            this.dogId = dogId;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setStaffId(int staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        //Returning AdoptionRecord instance with builder's attributes
        public AdoptionRecord build() {

            return new AdoptionRecord(this);
        }

        //Copy/Clone method
        private Builder copy(AdoptionRecord adoptionRecord){

            this.adoptionId = adoptionRecord.adoptionId;
            this.customerId = adoptionRecord.customerId;
            this.date = adoptionRecord.date;
            this.dogId = adoptionRecord.dogId;
            this.staffId = adoptionRecord.staffId;

            return this;
        }

    }

}//end of AdoptionRecord class
