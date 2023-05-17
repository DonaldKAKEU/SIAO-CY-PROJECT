package Model;

public class Center {
    private int id;
    private String name;
    private String address;

    public  void Center(int id, String name, String address){
        this.id = id;
        this.name= name;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(String address){
        this.address=address;
    }

}
