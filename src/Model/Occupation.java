package Model;

import java.util.Date;

public class Occupation {
    private int id;
    private Date startDate;
    private Date finishDate;
    private peopleInNeed people;

    public void Occupation(int id, Date startDate, Date finishDate, peopleInNeed people){
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public peopleInNeed getPeople() {
        return people;
    }

    public void setPeople(peopleInNeed people) {
        this.people = people;
    }
}
