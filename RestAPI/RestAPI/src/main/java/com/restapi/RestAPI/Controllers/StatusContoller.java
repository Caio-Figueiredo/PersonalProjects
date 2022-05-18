package com.restapi.RestAPI.Controllers;

import com.restapi.RestAPI.Models.StatusModels;
import com.restapi.RestAPI.Repositories.StatusRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StatusContoller {

    private String status;

    private StatusRepository repository;


    @GetMapping(path = "/api/status/{codigo}")
    public getStatus(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo);
    }
    @PutMapping
    public void setStatus(String status) {
        this.status = status;
    }
}
