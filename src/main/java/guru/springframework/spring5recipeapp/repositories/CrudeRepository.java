package guru.springframework.spring5recipeapp.repositories;

import java.util.Set;

public interface CrudeRepository<T, ID>{
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
