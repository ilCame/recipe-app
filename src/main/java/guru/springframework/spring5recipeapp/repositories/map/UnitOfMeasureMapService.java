package guru.springframework.spring5recipeapp.repositories.map;

import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class UnitOfMeasureMapService extends AbstractMapService<UnitOfMeasure, Long> implements UnitOfMeasureRepository{

    @Override
    public Optional<UnitOfMeasure> findByDescription(String description) {
        return Optional.empty();
    }

    @Override
    public Set<UnitOfMeasure> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(UnitOfMeasure object) {
        super.delete(object);
    }

    @Override
    public UnitOfMeasure save(UnitOfMeasure object) {
        return super.save(object);
    }

    @Override
    public UnitOfMeasure findById(Long id) {
        return super.findById(id);
    }
}
