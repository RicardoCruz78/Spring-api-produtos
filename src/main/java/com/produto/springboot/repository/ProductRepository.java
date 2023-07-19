package com.produto.springboot.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produto.springboot.models.ProductModel;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
