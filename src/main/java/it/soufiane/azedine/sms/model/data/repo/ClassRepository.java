package it.soufiane.azedine.sms.model.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import it.soufiane.azedine.sms.model.data.entities.Class;

public interface ClassRepository extends CommonRepository<Class> {
    List<Class> findByTeacher(String teacher);

    @Query("select c from class where c.courseid = ?1 and c.section = ?2")
    Class findByCourseAndSection(String courseId, int section);

    @Query("insert into 'class' values ('studeId', 'courseId', 'section') values ('?1', '?2', '?3')")
    Class addStudent(int studId, String courseId, int section);
    
}
