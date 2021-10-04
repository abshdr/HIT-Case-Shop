package com.example.demo.repositories;


import com.example.demo.entities.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepo extends JpaRepository<CaseEntity, Long> {

    List<CaseEntity> findByModelName(String modelName);

    @Query("SELECT caseEntity "+
            "FROM CaseEntity caseEntity INNER JOIN ModelEntity modelEntity "+
            "ON caseEntity.dimensions = modelEntity.dimensions "+
            "WHERE modelEntity.name = :name")
    List<CaseEntity> getCasesByName(String name);
}

