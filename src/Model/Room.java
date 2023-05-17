package Model;

public class Room {
    private int id;
    private int number;
    private String restrictions;
    private int numberBeds;

    public void Room(int id, int number, String restrictions, int numberBeds){
        this.id = id;
        this.number = number;
        this.restrictions = restrictions;
        this.numberBeds = numberBeds;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public int getNumberBeds() {
        return numberBeds;
    }

    public void setNumberBeds(int numberBeds) {
        this.numberBeds = numberBeds;
    }
}
