package com.tempo.project;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.tempo.project.entities.Role;
import com.tempo.project.repositories.RoleRepository;
import com.tempo.project.resources.AccessAPIResources;
import com.tempo.project.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class TempoProjectApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(TempoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
