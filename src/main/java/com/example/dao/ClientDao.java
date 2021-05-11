package com.example.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Project;
import com.example.model.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Integer> {
	List<Client> findAll();
}
