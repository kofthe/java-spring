package DataAccess.Course;

import Entities.Course;

public class JdbcCourseDTO implements CourseDTO{

    @Override
    public String addCourse(Course course) {
        return "JDBC ile Kurs Eklendi.";
    }
}
