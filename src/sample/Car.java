package sample;

import java.util.Date;

/**
 * @author Dory Mauretour
 */
public final class Car extends Vehicle {

    //Declare local variables
    private Feature[] feature = new Feature[10];
    private int carAxle;

    //Constructor for objects of class Vehicle

    /**
     * This function will initiate SQL to manipulate and interact with database
     *
     * @param
     * @retrun null
     */
    public Car() {
        //initialize vehicle
        super();

        // This sets the features and axle
        Feature[] f = {new InteriorFeature("No Interior Features"),
                new ExteriorFeature("No Exterior Features")};
        this.feature = f;
        this.carAxle = 2;
    }

    //Constructor for objects of class Vehicle

    /**
     * This method is initiating the variables that will makeup a "Car"
     *
     * @param vehicleManufacturer, Date vehicleManufactureDate, String vehicle make,String vehicleModel,
     *                             String vehicleType,Chassis vehicleFrame,Engine vehicleEngine,Feature[] feature,
     */
    public Car(String vehicleManufacturer,
               Date vehicleManufactureDate,
               String vehicleMake,
               String vehicleModel,
               String vehicleType,
               Chassis vehicleFrame,
               Engine vehicleEngine,
               Feature[] feature,
               int carAxle) {


        //Initialize vehicle
        super(vehicleManufacturer, vehicleManufactureDate,
                vehicleMake, vehicleModel, vehicleType, vehicleFrame, vehicleEngine);

        this.feature = feature;
        this.carAxle = carAxle;
    }

    //Declare local get list for getExteriorFeatures
    public String getExteriorFeatures() {

        //Declaring local variables for comma separated value
        String value = "";
        //Read the features into a comma separated value
        for (int i = 0; i < this.feature.length; i++) {
            if (this.feature[i] instanceof ExteriorFeature) {
                if (value.length() == 0) {
                    value += this.feature[i];
                } else value += "\n            :"
                        + this.feature[i];
            }
        }
        //Return tokenized string

        return value;
    }

    //Declare local get list for InteriorFeatures
    public String getInteriorFeatures() {
        //Declare local variable for comma separated value2
        String value = "";
        // Read the features into a comma separated value2.
        for (int i = 0; i < this.feature.length; i++) {
            if (this.feature[i] instanceof InteriorFeature) {
                if (value.length() == 0) {
                    value += this.feature[i];
                } else {
                    value += "\n        :" + this.feature[i];
                }
            }
        }


        // Return tokenized string.

        return value;
    }


    /*    *  Override the toString() method.    */
    public String toString() {
        // Declare local variable for comma separated value.
        String value = "";
        // Read the features into a comma separated value.
        for (int i = 0; i < this.feature.length; i++) {
            if (value.length() == 0) {
                value += this.feature[i];
            } else {
                value += "\n     :"
                        + this.feature[i];
            }
        }

        //Print instance description
        return super.toString() + "\n" +
                "Features      :" + value + "\n" + "Car Axle      : " + carAxle;
    }
}



