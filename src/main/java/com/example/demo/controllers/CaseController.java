package com.example.demo.controllers;
import com.example.demo.entities.Brand;
import com.example.demo.entities.Case;
import com.example.demo.entities.Model;
import com.example.demo.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.CaseService;
import java.util.List;



@RestController
public class CaseController {
@Autowired
private CaseService caseService;

@GetMapping("/cases")
public List<Case> getAll(){
    return caseService.getAll();
}


    @GetMapping("/casesBymodel/{modelname}")
    public List<Case> getByModelname(@PathVariable String modelname) {
        return caseService.getByModelname(modelname);
    }

    @GetMapping("/casesByDimension/{dimensions}")
    public List<Case>  getAllByDimensions(@PathVariable String dimensions)
    {
        return caseService.getAllByDimensions(dimensions);
    }
    @GetMapping("/rest/getCasesBymodelName/{name}")
    public List<Case> getCasesByName(@PathVariable String name){
        return caseService.getCasesByName(name);
    }



    @PostMapping("/register/case")
    public Case register(@RequestBody Case cases) {
        return caseService.addCase(cases);
    }




}
