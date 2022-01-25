package guru.springframework.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.SecondaryTable;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }
    @Test
    void getId() {

        Long idValue = 4l;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() {
        String description = "and your next line will be...";

        category.setDescription(description);

        assertEquals(description, category.getDescription());
    }

    @Test
    void getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        Recipe recipe = new Recipe();

        recipes.add(recipe);

        category.setRecipes(recipes);

        assertEquals(recipes, category.getRecipes());
    }
}