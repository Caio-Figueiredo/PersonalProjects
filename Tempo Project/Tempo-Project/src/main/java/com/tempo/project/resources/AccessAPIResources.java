package com.tempo.project.resources;

import com.tempo.project.entities.TempoUsers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class AccessAPIResources {


    public TempoUsers consumerApi(String userPath){

        RestTemplate restTemplate = new RestTemplate();

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("cgjresszgg.execute-api.eu-west-1.amazonaws.com/users")
                .path(userPath)
                .build();

        ResponseEntity<TempoUsers> user = restTemplate.getForEntity(uri.toUriString(), TempoUsers.class);

        return user.getBody();
    }

}
