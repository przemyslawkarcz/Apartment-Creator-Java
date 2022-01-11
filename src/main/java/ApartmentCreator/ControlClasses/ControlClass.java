package ApartmentCreator.ControlClasses;

import ApartmentCreator.Exceptions.ApartmentCreatorDataFormatException;

public class ControlClass {

    // method that checks data format
    public Integer controlsDataFormat(String someText) throws ApartmentCreatorDataFormatException {

        try {

            return Integer.parseInt(someText);

        }catch (NumberFormatException e){

            throw new ApartmentCreatorDataFormatException(someText);

        }

    }

    // method that checks rooms number
    public Integer controlsRoomsNumber(Integer someRoomsNumber){

        if (someRoomsNumber >= 11 || someRoomsNumber < 0){
            System.out.println("Do not overdo with it :)");
            System.out.println("10 bedrooms is maximum.");
            return 7778;
        }
        return someRoomsNumber;
    }

}
