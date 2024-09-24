package com.fnma.controllers;

import com.fnma.models.Bio;
import com.fnma.services.BioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bios")
public class BioController {

    private final BioService bioService;

    @Autowired
    public BioController(BioService bioService) {
        this.bioService = bioService;
    }

    // TODO Get all bios handler
    @GetMapping
    public List<Bio> getAllBiosHandler(){
        return bioService.findAll();
    }


    // TODO create new Bio handler
    @PostMapping
    public Bio createNewBioHandler(@RequestBody Bio bio){
        return bioService.createNewBio(bio);
    }
}
