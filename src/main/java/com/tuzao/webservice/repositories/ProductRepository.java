package com.tuzao.webservice.repositories;

import com.tuzao.webservice.entities.Product;
import com.tuzao.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
