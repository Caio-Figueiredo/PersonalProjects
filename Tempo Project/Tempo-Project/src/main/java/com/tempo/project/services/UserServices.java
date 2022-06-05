package com.tempo.project.services;

import com.tempo.project.entities.Role;
import com.tempo.project.entities.TempoUsers;
import com.tempo.project.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UsersRepository usersRepository;

    public UserServices(){}

    public List<TempoUsers> findAll(){
        return usersRepository.findAll();
    }

    public TempoUsers findById(Long id){
        Optional<TempoUsers> user = usersRepository.findById(id);
        return user.get();
    }


    public void createUser(TempoUsers users){
        Long userId = users.getUserId();
        String firstName = users.getFirstName();
        String lastName = users.getLastName();
        String displayName = users.getDisplayName();
        String avatarUrl = users.getAvatarUrl();
        String location = users.getLocation();
        TempoUsers user = new TempoUsers(userId, firstName, lastName, displayName, avatarUrl, location);
        usersRepository.save(user);
    }

    public TempoUsers assignRole(Long id, Integer roleId){
        TempoUsers entity = usersRepository.getReferenceById(id);
        updateEntity(entity, roleId);
        return usersRepository.save(entity);
    }

    public void updateEntity(TempoUsers entity, Integer id){
        entity.setRoles(id);
    }


}
