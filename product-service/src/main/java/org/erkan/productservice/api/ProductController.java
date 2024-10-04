package org.erkan.productservice.api;

import org.erkan.productservice.model.Product;
import org.erkan.productservice.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public
class ProductController {
    private final
    ProductRepository productRepository;

    public
    ProductController ( ProductRepository productRepository ) {
        this.productRepository = productRepository;
    }

    @GetMapping("")
    public ResponseEntity<?> findAll(){
        try {
            return new ResponseEntity<> ( productRepository.findAll (),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<> ( e,HttpStatus.BAD_REQUEST );
        }
    }

    @PostMapping("")
    public ResponseEntity<?> saveProduct( @RequestBody Product product ){
        try {
            return new ResponseEntity<> ( productRepository.save ( product ),HttpStatus.OK );
        }catch (Exception e){
            return new ResponseEntity<> ( e,HttpStatus.BAD_REQUEST);
        }
    }


}
