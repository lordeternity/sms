package it.soufiane.azedine.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.soufiane.azedine.sms.model.data.entities.Course;
import it.soufiane.azedine.sms.model.data.entities.Student;
import it.soufiane.azedine.sms.model.data.entities.Teacher;

import it.soufiane.azedine.sms.model.data.repo.CourseRepository;
import it.soufiane.azedine.sms.model.data.repo.StudentRepository;
import it.soufiane.azedine.sms.model.data.repo.TeacherRepository;
import it.soufiane.azedine.sms.model.services.EnrollService;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping(path="/rest")
public class SmsController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrollService enrollService;

    @PostMapping(path = "addstudent")
    public @ResponseBody String addStudent(@RequestParam String fname, @RequestParam String lname, @RequestParam int studId) {

        Student eStud = new Student();
        eStud.setFname(fname);
        eStud.setLname(lname);
        eStud.setStudId(studId);

        studentRepository.save(eStud);
 
        return "Student Add Success"; //For debug and confirmation
    }

    @PostMapping(path = "addteacher")
    public @ResponseBody String addTeacher(@RequestParam String fname, @RequestParam String lname, @RequestParam String school, @RequestParam int teacherId) {

        Teacher eTeach = new Teacher();
        eTeach.setFname(fname);
        eTeach.setLname(lname);
        eTeach.setSchool(school);
        eTeach.setTeacherId(teacherId);

        teacherRepository.save(eTeach);
 
        return "Teacher Add Success";
    }

    @PostMapping(path = "addcourse")
    public @ResponseBody String addCourse(@RequestParam String courseId, @RequestParam String coursedescription, @RequestParam int credits) {

        Course eCourse = new Course();
        eCourse.setCourseId(courseId);
        eCourse.setCoursedescription(coursedescription);
        eCourse.setCredits(credits);

        courseRepository.save(eCourse);
        
 
        return "Course Add Success";
    }


    @PostMapping(path = "enroll")
    public @ResponseBody String enroll(@RequestParam int studId, @RequestParam String courseId, @RequestParam int section){

        int status = enrollService.enrollStudent(studId, courseId, section);

        if(status == 1){
            return "Student Enrolled Successfully";
        }else{
            return "Student Was Not Enrolled";

        }

    }
    

    
}
