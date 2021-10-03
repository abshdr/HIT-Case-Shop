package com.example.demo.services;


import com.example.demo.entities.Brand;
import com.example.demo.entities.Case;
import com.example.demo.entities.Model;
import com.example.demo.repositories.CaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CaseService {

    @Autowired
    private CaseRepo caseRepo;


    public List<Case> getAll() {
        return caseRepo.findAll();
    }


    public List<Case> getByModelname(String modelname) {return caseRepo.getByModelname(modelname);}


    public List<Case> getCasesByName(String name) {
        return caseRepo.getCasesByName(name);
    }



    public Case addCase(Case cases) {
        return caseRepo.save(cases);

    }


}
