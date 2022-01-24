package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudeRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
