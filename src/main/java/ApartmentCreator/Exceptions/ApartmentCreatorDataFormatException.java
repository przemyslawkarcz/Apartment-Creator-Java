package ApartmentCreator.Exceptions;

public class ApartmentCreatorDataFormatException extends Exception{

    public String friendlyMessage;

    public ApartmentCreatorDataFormatException(String friendlyMessage) {
        this.friendlyMessage = friendlyMessage;
        System.out.println("The entered data '" + friendlyMessage + "' is not an integer.");
        System.out.println("The creator has been stopped! To play restart it :)");
    }

    public String getFriendlyMessage() {
        return friendlyMessage;
    }

}
