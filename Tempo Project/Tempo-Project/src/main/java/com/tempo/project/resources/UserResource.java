package com.tempo.project.resources;

import com.tempo.project.entities.Role;
import com.tempo.project.entities.TempoUsers;
import com.tempo.project.services.RoleService;
import com.tempo.project.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private UserServices userServices;

    @Autowired
    private RoleService roleServices;


    @GetMapping
    public ResponseEntity<List> findAll(){
        return ResponseEntity.ok().body(userServices.findAll());
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<TempoUsers> findById(@PathVariable Long userId) {
        TempoUsers foundUser = userServices.findById(userId);
        return ResponseEntity.ok().body(foundUser);
    }

    @PostMapping
    public ResponseEntity<TempoUsers> createUsers(@RequestBody String uri){
        AccessAPIResources accessApi = new AccessAPIResources();
        TempoUsers user = accessApi.consumerApi(uri);
        userServices.createUser(user);
        return ResponseEntity.ok().body(user);
    }

    @PutMapping(value = "/{userId}")
    public ResponseEntity<TempoUsers> assignUserRole( @PathVariable Long userId, @RequestBody Integer roleId){
        TempoUsers updatedUser = userServices.assignRole(userId, roleId);
        return ResponseEntity.ok().body(updatedUser);
    }


}
