package com.tuzao.webservice.repositories;

import com.tuzao.webservice.entities.Category;
import com.tuzao.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
