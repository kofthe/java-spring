package DataAccess.Category;

import Entities.Category;

public class HibernateCategoryDTO implements CategoryDTO{
    @Override
    public void addCategory(Category category) {
        System.out.println("Hibernate ile kurs eklendi");
    }
}
