package org.erkan.categoryservice.api;

import org.erkan.categoryservice.model.Category;
import org.erkan.categoryservice.repository.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public
class CategoryController {
    private
    CategoryRepository categoryRepository;

    public
    CategoryController ( CategoryRepository categoryRepository ) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public
    List<Category> findAll(){
        return categoryRepository.findAll ();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable String id){
        return categoryRepository.findById ( id ).get ();
    }

    @PostMapping
    public Category save( @RequestBody Category category ){
        return categoryRepository.save (  category);
    }


}
