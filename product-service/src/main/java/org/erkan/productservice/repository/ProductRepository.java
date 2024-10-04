package org.erkan.productservice.repository;

import org.erkan.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface ProductRepository extends JpaRepository<Product,Long> {
}
