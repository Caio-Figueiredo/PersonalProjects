package com.tempo.project.resources;

import com.tempo.project.entities.Role;
import com.tempo.project.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/roles")
public class RoleResource {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> findAll() {
        return ResponseEntity.ok().body(roleService.findAll());
    }

    @PostMapping
    public ResponseEntity<Role> createNewRole(@RequestBody Role role){
        role = roleService.createNewRole(role);
        return ResponseEntity.ok().body(role);
    }

    @DeleteMapping
    public ResponseEntity<Role> deleteRole(@RequestBody Role role){
        roleService.deleteRole(role);
        return ResponseEntity.ok().body(role);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Role>> findById(@PathVariable Integer id){
        Optional<Role>foundRole = roleService.findById(id);
        return ResponseEntity.ok().body(foundRole);
    }

}
