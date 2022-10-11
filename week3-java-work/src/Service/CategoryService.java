package Service;

import Core.Logger;
import DataAccess.Category.HibernateCategoryDTO;
import Entities.Category;

import java.util.Objects;

public class CategoryService {

    public CategoryService(HibernateCategoryDTO hibernateCategoryDTO, Logger[] loggers) {
    }

    public void addCategory(Category category) throws Exception {
        Category[] categories = new Category[] {
                new Category(3, "Bilişim","Bilişim ALanındaki Kurslar"),
                new Category(1,"Matematik", "Matematik Alanındaki Kurslar"),
                new Category(2,"Fizik", "Fizik alanındaki Kurslar"),
        };
        for (Category cat : categories) {
            if (Objects.equals(cat.getCategoryName(), category.getCategoryName())) {
                throw new Exception("Aynı Kategori İsmi Olamaz.");
            }
        }
    }
}
