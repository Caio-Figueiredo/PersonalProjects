package com.tempo.project.resources;


import com.tempo.project.entities.TempoUsers;
import com.tempo.project.services.RoleService;
import com.tempo.project.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private AccessAPIResources accessApi = new AccessAPIResources();

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
        return ResponseEntity.ok().body(userServices.findById(userId));
    }

    @PostMapping
    public ResponseEntity<String> createUsers(@RequestBody String uri){
        userServices.createUser(accessApi.consumerApi(uri));
        return ResponseEntity.ok().body("Usuário criado!");
    }

    @PutMapping(value = "/{userId}")
    public ResponseEntity<TempoUsers> assignUserRole( @PathVariable Long userId, @RequestBody Integer roleId){
        return ResponseEntity.ok().body(userServices.assignRole(userId, roleId));
    }


}
