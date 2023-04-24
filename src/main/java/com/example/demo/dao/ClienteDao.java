package com.example.demo.dao;

import com.example.demo.models.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
