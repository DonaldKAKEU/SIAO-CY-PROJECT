package Model;

public class CenterUser {
    private int id;
    private int id_center; // clé étrangère
    private String email;
    private String password;

    public void CenterUser(int id, int id_center, String email, String password){
        this.id = id;
        this.id_center = id_center;
        this.email = email;
        this.password = password;
    }

    public void create(){

    }


    public int getId() {
        return id;
    }

    public int getId_center() {
        return id_center;
    }

    public void setId_center(int id_center) {
        this.id_center = id_center;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

