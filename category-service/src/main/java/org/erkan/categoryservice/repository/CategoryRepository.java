package org.erkan.categoryservice.repository;

import org.erkan.categoryservice.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface CategoryRepository extends MongoRepository<Category,String > {
}
