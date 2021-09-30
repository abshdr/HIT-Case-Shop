package com.example.demo.repositories;


import com.example.demo.entities.Dimension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DimensionRepo extends JpaRepository<Dimension, Long> {



    @Query(value = "SELECT cases.id, cases.manufacturer, cases.modelname, cases.dimensions, name "+
                    "FROM cases INNER JOIN model "+
                    "ON cases.dimensions= model.dimensions "+
                    "WHERE model.name = ?1 ", nativeQuery = true)

    List<Dimension> getCasesByName(String name);
}
