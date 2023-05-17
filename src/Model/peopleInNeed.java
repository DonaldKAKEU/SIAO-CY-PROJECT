package Model;

import java.util.Date;

public class peopleInNeed {
    private int id;
    private String firstName;
    private String lastName;
    private Boolean gender;
    private int age;
    private String socialSecurity;
    private Date dateBirth;
    private String cityBirth;

    public void peopleInNeed(int id, String firstName, String lastName, Boolean gender, int age, String socialSecurity, Date dateBirth, String cityBirth){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.socialSecurity = socialSecurity;
        this.dateBirth = dateBirth;
        this.cityBirth = cityBirth;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getCityBirth() {
        return cityBirth;
    }

    public void setCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
    }
}
