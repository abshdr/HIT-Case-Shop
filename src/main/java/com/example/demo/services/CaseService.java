package com.example.demo.services;



import com.example.demo.entities.CaseEntity;
import com.example.demo.repositories.CaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CaseService {

    @Autowired
    private CaseRepo caseRepo;


    public List<CaseEntity> getAll() {
        return caseRepo.findAll();
    }


    public List<CaseEntity> getByModelName(String modelName) {return caseRepo.findByModelName(modelName);}


    public List<CaseEntity> getCasesByName(String name) {
        return caseRepo.getCasesByName(name);
    }



    public CaseEntity addCase(CaseEntity cases) {
        return caseRepo.save(cases);

    }


}
