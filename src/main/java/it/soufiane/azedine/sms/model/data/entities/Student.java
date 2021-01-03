package it.soufiane.azedine.sms.model.data.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.micrometer.core.lang.NonNull;

@Entity
public class Student extends CommonEntity{

    @NonNull
    private String fname;

    @NonNull
    private String lname;

    @Id
    @NonNull
    private int studId;

    private int creditHours;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
}
