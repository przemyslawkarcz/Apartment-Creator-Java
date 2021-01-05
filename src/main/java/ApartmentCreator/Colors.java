package ApartmentCreator;

public enum Colors {

    Grey100("Grey 100%"),
    Grey90("Grey 90%"),
    Grey80("Grey 80%"),
    Grey70("Grey 70%"),
    Grey60("Grey 60%"),
    Grey50("Grey 50%"),
    Grey40("Grey 40%"),
    Grey30("Grey 30%"),
    Grey20("Grey 20%"),
    Grey10("Grey 10%"),
    White("White")
    ;

    public final String colorName;

    Colors(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
