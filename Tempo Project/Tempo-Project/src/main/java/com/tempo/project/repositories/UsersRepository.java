package com.tempo.project.repositories;

import com.tempo.project.entities.TempoUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<TempoUsers, Long> {
}
