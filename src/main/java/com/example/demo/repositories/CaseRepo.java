package com.example.demo.repositories;


import com.example.demo.entities.Case;
import com.example.demo.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepo extends JpaRepository<Case, Long> {

    List<Case> getByModelname(String modelname);

    List<Case> getAllByDimensions(String dimensions);


/*
    @Query(value = "SELECT "+
                   "cases.manufacturer, cases.modelname "+
                   "FROM cases INNER JOIN model "+
                   "ON cases.dimensions= model.dimensions "+
                    "WHERE model.name = ?1 ", nativeQuery = true)
                    List<Case> getAllMatchingCases(String modelname);
*/
}

