package com.example.dao;

import com.example.entities.Trajet;
import com.example.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface TrajetRepo extends JpaRepository<Trajet,Long> {
}
