package com.orange.digital.academy.api_module.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "academicien")
public class Academicien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_academicien;
    private String toto;
    private String nom;
    private String prenom;

    @ManyToOne
    private Academicien academicien;

    public Academicien getAcademicien() {
        return academicien;
    }

    public void setAcademicien(Academicien academicien) {
        this.academicien = academicien;
    }

    public Academicien() {
        
    }

    public Academicien(Integer id_academicien, String toto, String nom, String prenom) {
        this.id_academicien = id_academicien;
        this.toto = toto;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getId_academicien() {
        return id_academicien;
    }

    public void setId_academicien(Integer id_academicien) {
        this.id_academicien = id_academicien;
    }

    public String getToto() {
        return toto;
    }

    public void setToto(String toto) {
        this.toto = toto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    
}
