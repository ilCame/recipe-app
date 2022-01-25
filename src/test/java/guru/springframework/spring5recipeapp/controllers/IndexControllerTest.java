package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import guru.springframework.spring5recipeapp.services.RecipeService;
import guru.springframework.spring5recipeapp.services.RecipeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    RecipeServiceImpl recipeService;

    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String viewName = controller.getIndexPage(model);

        assertEquals("index", viewName);

        verify(recipeService, times(1)).getRecipes();

    }
}