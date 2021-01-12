package ApartmentCreator.Equipment;

public class DecorativeAccessories {

    public String paintings;
    public String pictures;
    public String posters;

    public String getPaintings() {
        return paintings;
    }

    public void setPaintings(String paintings) {
        this.paintings = paintings;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getPosters() {
        return posters;
    }

    public void setPosters(String posters) {
        this.posters = posters;
    }

    @Override
    public String toString() {
        return "DecorativeAccessories{" +
                "paintings='" + paintings + '\'' +
                ", pictures='" + pictures + '\'' +
                ", posters='" + posters + '\'' +
                '}';
    }

}
