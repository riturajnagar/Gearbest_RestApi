package com.gearbest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gearbest.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
