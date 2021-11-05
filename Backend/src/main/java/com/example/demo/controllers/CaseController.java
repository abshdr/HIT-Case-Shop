package com.example.demo.controllers;
import com.example.demo.entities.CaseEntity;
import com.example.demo.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/rest")

public class CaseController {
@Autowired
private CaseService caseService;

    @GetMapping("/getAllCases")
    public List<CaseEntity> getAll(){
        return caseService.getAll();
    }


    @GetMapping("/search/for/cases/by/modelName/{modelName}")
    public List<CaseEntity> getByModelName(@PathVariable String modelName) {
        return caseService.getByModelName(modelName);
    }


    @GetMapping("/search/for/cases/by/modelDimension/{name}")
    public List<CaseEntity> getCasesByName(@PathVariable String name){
        return caseService.getCasesByName(name);
    }



    @PostMapping("/register/case")
    public CaseEntity register(@RequestBody CaseEntity cases) {
        return caseService.addCase(cases);
    }




}
