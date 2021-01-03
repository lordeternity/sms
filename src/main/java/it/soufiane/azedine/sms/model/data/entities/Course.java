package it.soufiane.azedine.sms.model.data.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.micrometer.core.lang.NonNull;

@Entity
public class Course extends CommonEntity{

    @Id
    @NonNull
    private String courseId;

    @NonNull
    private int credits;

    @OneToMany(mappedBy = "Class")
    private List<Class> sections;

    @NonNull
    private String coursedescription;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public List<Class> getSections() {
        return sections;
    }

    public void setSections(List<Class> sections) {
        this.sections = sections;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }






    
}
