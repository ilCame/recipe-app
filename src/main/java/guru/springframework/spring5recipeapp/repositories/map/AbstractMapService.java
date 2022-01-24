package guru.springframework.spring5recipeapp.repositories.map;

import guru.springframework.spring5recipeapp.domain.BaseEntity;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll (){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return (T) map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("KABOOOM");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.remove(object);
    }

    private Long getNextId()
    {
        Long nextId = null;

        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}
