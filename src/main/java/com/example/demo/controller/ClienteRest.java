package com.example.demo.controller;


import com.example.demo.dao.ClienteDao;
import com.example.demo.dao.EspecialidadDao;
import com.example.demo.dao.TypeDocumentDao;
import com.example.demo.models.Cliente;
import com.example.demo.models.Especialidad;
import com.example.demo.models.TypeDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteRest {


    @Autowired
    ClienteDao clienteDao;

    @Autowired
    TypeDocumentDao typeDocumentDao;

    @Autowired
    EspecialidadDao especialidadDao;

    @GetMapping("/")
    public String ping () {
        return "ok";
    }

    @GetMapping("/cli")
    public List<Cliente> clienteAll () {

        return (List<Cliente>) clienteDao.findAll();
    }

    @GetMapping("/doc")
    public List<TypeDocument> docAll () {

        return (List<TypeDocument>) typeDocumentDao.findAll();
    }

    @GetMapping("/esp")
    public List<Especialidad> espeAll () {

        return (List<Especialidad>) especialidadDao.findAll();
    }
}
