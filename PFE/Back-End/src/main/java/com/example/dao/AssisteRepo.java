package com.example.dao;

import com.example.entities.Assiste;
import com.example.entities.AssisteKey;
import org.json.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.*;
import java.net.*;

@RepositoryRestResource
@CrossOrigin("*")
public interface AssisteRepo extends JpaRepository<Assiste, AssisteKey> {

}
