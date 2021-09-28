package com.example.demo.repositories;


import com.example.demo.entities.Case;
import com.example.demo.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepo extends JpaRepository<Case, Long> {

    List<Case> getByModelname(String modelname);



}
