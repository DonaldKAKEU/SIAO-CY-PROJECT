package Model;

public class Bed {
    private int id;
    private Boolean bedType;  //0 pour un lit simple et 1 pour un lit double
    private int availabilityPlace; // 0 ou 1 ou 2 (pour lit double )



    public void Bed(int id, Boolean bedType, int availabilityPlace){
        this.id = id;
        this.bedType = bedType;
        this.availabilityPlace = availabilityPlace;

    }

    public int getId() {
        return id;
    }

    public Boolean getBedType() {
        return bedType;
    }

    public void setBedType(Boolean bedType) {
        this.bedType = bedType;
    }

    public int getAvailabilityPlace() {
        return availabilityPlace;
    }

    public void setAvailabilityPlace(int availabilityPlace) {
        this.availabilityPlace = availabilityPlace;
    }
}
