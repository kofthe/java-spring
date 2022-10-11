import Core.DatabaseLogger;
import Core.EmailLogger;
import Core.FileLogger;
import Core.Logger;
import DataAccess.Category.HibernateCategoryDTO;
import DataAccess.Category.JdbcCourseDTO;
import DataAccess.Instructor.HibernateInstructorDTO;
import DataAccess.Instructor.InstructorDTO;
import DataAccess.Instructor.JdcbInstructorDTO;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Service.CategoryService;
import Service.CourseService;
import Service.InstructorService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

        Course course = new Course(1, "Kurs Adi" , "ASDSAD");
        Instructor instructor = new Instructor(3L,"Cennet", "Kdir");
        Category category = new Category(1, "Müzik Kursu", "Müzik Kursu Falan filan");

        Logger[] loggers = {new EmailLogger(), new FileLogger(), new DatabaseLogger()};

        CategoryService categoryService = new CategoryService(new HibernateCategoryDTO(),loggers);
        CourseService courseService = new CourseService(new JdbcCourseDTO(),loggers);
        InstructorService instructorService = new InstructorService(new JdcbInstructorDTO(), loggers);
}