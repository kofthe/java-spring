package DataAccess.Category;

import Entities.Category;

public class JdbcCourseDTO implements CategoryDTO{

    Category category;
    @Override
    public void addCategory(Category category) {

        System.out.println("Jdbc ile Kurs Eklendi");
    }
}
