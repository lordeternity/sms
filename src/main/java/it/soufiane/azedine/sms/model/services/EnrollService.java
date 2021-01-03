package it.soufiane.azedine.sms.model.services;

import org.springframework.beans.factory.annotation.Autowired;

import it.soufiane.azedine.sms.model.data.entities.Class;
import it.soufiane.azedine.sms.model.data.entities.Student;
import it.soufiane.azedine.sms.model.data.repo.ClassRepository;
import it.soufiane.azedine.sms.model.data.repo.StudentRepository;
import it.soufiane.azedine.sms.model.data.repo.TeacherRepository;

public class EnrollService {

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    public int enrollStudent(int studId, String courseId, int section){
        int flag = 0;
        Student student = studentRepository.findById(studId).get();

        Class sClass = classRepository.findByCourseAndSection(courseId, section);

        if(sClass.getCurrentStudCount() < sClass.getStudentCap()){
            classRepository.addStudent(studId, courseId, section);
            flag = 1;
        }

        return flag;

    }




    
}
