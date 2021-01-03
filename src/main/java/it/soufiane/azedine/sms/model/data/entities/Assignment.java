package it.soufiane.azedine.sms.model.data.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.core.lang.NonNull;

@Entity
public class Assignment extends CommonEntity {

    @NonNull
    protected String description;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    protected List<Student> students; 

    @DateTimeFormat
    protected Date duedate;

    protected String worklocation;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getWorklocation() {
        return worklocation;
    }

    public void setWorklocation(String worklocation) {
        this.worklocation = worklocation;
    }


    
}
