package com.example.demo.dao;

import com.example.demo.entities.region;
import com.example.demo.entities.ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface RegionRepo extends JpaRepository<region,Long> {
    @RestResource(path = "/ville")
    @Query("SELECT v FROM ville v WHERE v.ville LIKE CONCAT('%',:ville,'%')")
    List<ville> findVillelike(@Param("ville") String ville);
}


