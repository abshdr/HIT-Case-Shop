package com.example.demo.repositories;


import com.example.demo.entities.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepo extends JpaRepository<ModelEntity, Long> {
    List<ModelEntity> findByBrandId(long brandId);

    List<ModelEntity> getByName(String name);
}
