package it.soufiane.azedine.sms.model.data.entities;

import javax.persistence.Entity;
// import javax.validation.constraints.NotNull; This does not exist for my system for some reason. Running Java SE 15
import javax.persistence.Id;

import io.micrometer.core.lang.NonNull;





@Entity
public class Teacher extends CommonEntity{

    @Id
    @NonNull
    private int teacherId;

    @NonNull
    private String fname;

    @NonNull
    private String lname;

    @NonNull
    private String school;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }




    
}
