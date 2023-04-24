package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Table(name = "type_document")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeDocument implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_document")
    private Integer idTypeDocument;

    @Column(name = "nombre")
    private String nombre;

    @JsonIgnoreProperties("typeDocument")
    @OneToMany(mappedBy = "typeDocument")
    private List<Cliente> clientes;

}
