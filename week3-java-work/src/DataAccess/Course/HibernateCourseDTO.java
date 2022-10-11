package DataAccess.Course;

import Entities.Course;

public class HibernateCourseDTO implements CourseDTO{

    @Override
    public String addCourse(Course course) {
        return "Hibernate ile Kurs Eklendi.";
    }
}
