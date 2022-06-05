package com.tempo.project.services;

import com.tempo.project.entities.Role;
import com.tempo.project.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public RoleService(){}

    public List<Role> findAll(){
        return roleRepository.findAll();
    }

    public Optional<Role> findById (Integer id) {
        try {
            return roleRepository.findById(id);
        }
        catch(Exception e) {
            return Optional.empty();
        }
    }


    public Role createNewRole(Role role){
        List<Role> list = roleRepository.findAll();
        Integer roleQtt = list.size();
        roleRepository.save(new Role((roleQtt + 1), role.getRoleName()));
        return role;
    }

    public void deleteRole(Role role){
        List<Role> rl = roleRepository.findAll();
        String name = role.getRoleName();
        Integer roleId = role.getRoleId();
        roleRepository.deleteById(roleId);
    }


}
