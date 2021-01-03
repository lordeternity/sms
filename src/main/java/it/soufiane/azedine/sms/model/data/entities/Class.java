package it.soufiane.azedine.sms.model.data.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import io.micrometer.core.lang.NonNull;

@Entity
public class Class extends CommonEntity {


    @NonNull
    @ManyToOne
    private Course courseId;

    @NonNull
    private int section;

    @NonNull
    @OneToOne
    private Teacher teacher;

    @OneToMany
    private List<Assignment> assignments;


    @OneToMany
    private List<Student> students;

    @NonNull
    private int studentCap;

    private int currentStudCount;

    public Course getCourse() {
        return courseId;
    }

    public void setCourse(Course courseId) {
        this.courseId = courseId;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getStudentCap() {
        return studentCap;
    }

    public void setStudentCap(int studentCap) {
        this.studentCap = studentCap;
    }

    public int getCurrentStudCount() {
        return currentStudCount;
    }

    public void setCurrentStudCount(int currentStudCount) {
        this.currentStudCount = currentStudCount;
    }

    
    

    
}
