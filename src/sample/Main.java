package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
    public static void main(String[] args) {

        // Test default constructor and print instance attributes
        Car car1 = new Car();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(car1);

        //Test overloaded constructor and print instance attribute
        System.out.println("----------------------------------------------------------------------------------");

        //Seed the features with subclasses
        Feature[] f = {new InteriorFeature("AM/FM Radio")
                , new ExteriorFeature("Wood Panels")
                , new InteriorFeature("Air Conditioning")
                , new ExteriorFeature("MoonRoof")};

        //Create an overloaded Car instance
        Car car2 = new Car("Honda", new Date(1325599999999L)
                , "Honda",
                "Prelude",
                "Coupe",
                new VehicleChassis("Unibody"),
                new ManufacturedEngine("Honda",
                        new Date(),
                        "H-Series",
                        "H23A1",
                        "2WD: Two-Wheel Drive",
                        4,
                        "88 AKI"),
                f,
                2);
        System.out.println(car2);

        // Test default constructor and print instance attributes
        System.out.println("----------------------------------------------------------------------------------");
        Vehicle vehi = new Car("Honda", new Date(1325599999999L),
                "Honda",
                "Prelude",
                "Coupe",
                new VehicleChassis("Unibody"),
                new ManufacturedEngine("Honda",
                        new Date(),
                        "H-Series",
                        "H23A1",
                        "2WD: Two-Wheel Drive",
                        4,
                        "88 AKI"),
                f, 2);
        System.out.println(((Car) vehi).getExteriorFeatures());

        //Test instanceOf operator separates interior or exterior features
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exterior Features       : " + car2.getExteriorFeatures());
        System.out.println("Interior Features       : " + car2.getInteriorFeatures());
        System.out.println("----------------------------------------------------------------------------------");


        // Test default constructor and print instance attributes
        System.out.println("----------------------------------------------------------------------------------");
        Vehicle vehi1 = new Vehicle();
        System.out.println(vehi1);

        //Test overloaded constructor and print instance attribute
        System.out.println("----------------------------------------------------------------------------------");
        Vehicle vehi2 = new Vehicle("Honda", new Date(1325599999999L), "Honda", "Prelude",
                "Coupe", new VehicleChassis("Unibody"), new ManufacturedEngine("Honda", new Date(),
                "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKi"));

        System.out.println(vehi2);
        System.out.println("----------------------------------------------------------------------------------");
        vehi2.setEngineCylinders(6);
        System.out.println(vehi2);
        System.out.println("----------------------------------------------------------------------------------");

        // Test default constructor and print instance attributes.
        System.out.println("----------------------------------------------------------------------------------");
        ExteriorFeature extFe1 = new ExteriorFeature();
        System.out.println(extFe1);

        // Test overloaded constructor and print instance attributes.
        System.out.println("----------------------------------------------------------------------------------");
        ExteriorFeature extFe2 = new ExteriorFeature("Fog Lamps");
        System.out.println(extFe2);
        System.out.println("----------------------------------------------------------------------------------");

        // Test default constructor and print instance attributes.
        System.out.println("----------------------------------------------------------------------------------");
        InteriorFeature intFea1 = new InteriorFeature();
        System.out.println(intFea1);

        // Test overloaded constructor and print instance attributes.

        System.out.println("----------------------------------------------------------------------------------");
        InteriorFeature intFeat2 = new InteriorFeature("Climate Control");
        System.out.println(intFeat2);

        // Test case for equal() method.
        System.out.println("----------------------------------------------------------------------------------");

        //Test default constructor and print instance attribute
        ManufacturedEngine manufactured1 = new ManufacturedEngine();
        System.out.println(manufactured1);

        //Test default constructor and print instance attributes
        System.out.println("----------------------------------------------------------------------------------");
        ManufacturedEngine manufactured2 =
                new ManufacturedEngine("Honda", new Date(1325599999999L)
                        , "H-Series", "H23A1"
                        , "2WD: Two-Wheel Drive", 4
                        , "88 AKI");
        System.out.println(manufactured2);
        System.out.println("----------------------------------------------------------------------------------");


        VehicleChassis vehiChassis1 = new VehicleChassis();
        System.out.println(vehiChassis1);

        //Test overloaded constructor and print instance attribute
        System.out.println("----------------------------------------------------------------------------------");

        VehicleChassis vehiChassis2 = new VehicleChassis("Test Chassis");
        System.out.println(vehiChassis2);
        System.out.println("----------------------------------------------------------------------------------");

        //Test default constructor and print instance attributes
        System.out.println("----------------------------------------------------------------------------------");
        VehicleFrame vehiFrame1 = new VehicleFrame();
        System.out.println(vehiFrame1);

        //Test overloaded constructor and print instance attributes
        System.out.println("----------------------------------------------------------------------------------");
        VehicleFrame vehiFrame2 = new VehicleFrame("ladder Frame");
        System.out.println(vehiFrame2);
        System.out.println("----------------------------------------------------------------------------------");

    }
}



