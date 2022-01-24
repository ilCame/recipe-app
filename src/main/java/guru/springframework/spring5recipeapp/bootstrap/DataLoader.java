package guru.springframework.spring5recipeapp.bootstrap;

import guru.springframework.spring5recipeapp.domain.Ingredient;
import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.repositories.RecipeRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final RecipeRepository recipeRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public DataLoader(RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Ingredient> perfectGuacaIngredient = new HashSet<>();

        Recipe perfectGuacamole = new Recipe();
        perfectGuacamole.setDescription("Perfect Guacamole");

        Ingredient avocado = new Ingredient();
        avocado.setDescription("Avocado");
        avocado.setAmount(BigDecimal.valueOf(2));
        //avocado.setRecipe(perfectGuacamole);

        Ingredient salt = new Ingredient();
        salt.setDescription("Salt");
        salt.setAmount(BigDecimal.valueOf(1/4));
        //avocado.setRecipe(perfectGuacamole);

        Ingredient lime = new Ingredient();
        lime.setDescription("Lime");
        lime.setAmount(BigDecimal.valueOf(1/2));
        //avocado.setRecipe(perfectGuacamole);

        perfectGuacaIngredient.add(avocado);
        perfectGuacaIngredient.add(salt);
        perfectGuacaIngredient.add(lime);

        perfectGuacamole.setIngredients(perfectGuacaIngredient);

        recipeRepository.save(perfectGuacamole);

    }
}
