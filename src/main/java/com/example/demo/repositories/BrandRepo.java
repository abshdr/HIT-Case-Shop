package com.example.demo.repositories;


import com.example.demo.entities.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends JpaRepository<BrandEntity, Long> {
}
