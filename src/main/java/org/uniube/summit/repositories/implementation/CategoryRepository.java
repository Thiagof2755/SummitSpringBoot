package org.uniube.summit.repositories.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.uniube.summit.repositories.entities.CategoryEntity;
import org.uniube.summit.repositories.jpa.CategoryRepositoryJPA;

import java.util.List;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryRepositoryJPA repositoryJPA;

    public List<CategoryEntity>findAll(){
        return repositoryJPA.findAll();
    }

    public CategoryEntity get(Long id){
        return repositoryJPA.findById(id).orElse(null);
    }

    public CategoryEntity save(CategoryEntity category){
        return repositoryJPA.save(category);
    }

    public void deleteById(Long id){
        repositoryJPA.deleteById(id);
    }

    public CategoryEntity update(CategoryEntity category){
        if (category.getId() != null && repositoryJPA.existsById(category.getId())){
            return repositoryJPA.save(category);
        } else {
            throw new IllegalArgumentException("Identificador deve ser nulo para operação de atualização!");
        }
    }
}
