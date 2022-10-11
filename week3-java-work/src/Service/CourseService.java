package Service;

import Core.Logger;
import DataAccess.Category.JdbcCourseDTO;
import DataAccess.Course.CourseDTO;
import DataAccess.Course.HibernateCourseDTO;
import Entities.Course;

import java.util.Objects;

public class CourseService {
    public CourseService(JdbcCourseDTO jdbcCourseDTO, Logger[] loggers) {
        this.loggers = loggers;

    }

    public void addCourse(Course course) throws Exception {
        Course[] courses = new Course[] {
                new Course(3, "Matematik Kursu", "TYT Öğrencileri için Matematik Kursu"),
                new Course(5,"Geometri Kursu","TYT Öğrencileri için geometri Kursu"),
                new Course(7, "AYT Matematik Kursu", "AYT Matematik Kursu"),
                new Course(2, "Bilgisayar Kursu", "Bilgisayar Kursudur."),
        };
        for (Course cour : courses) {
            if(Objects.equals(cour.getCourseName(), course.getCourseName())) {
                throw new Exception("Aynı Kurs Adı Olamaz");
            }
        }
    }
     Logger[] loggers;
}
