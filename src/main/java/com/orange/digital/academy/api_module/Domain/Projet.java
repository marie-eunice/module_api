package com.orange.digital.academy.api_module.Domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "projet")
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_projet;
    private String nom;
    private String description;
    private Date date_debut;
    private Date date_fin;

    @OneToMany
    @JoinColumn(name = "id_projet")
    private List<Module> modules;


   


    public List<Module> getModules() {
        return modules;
    }


    public void setModules(List<Module> modules) {
        this.modules = modules;
    }


    @OneToMany (mappedBy = "academicien")
    private List<Academicien> academiciens;

    public List<Academicien> getAcademiciens() {
        return academiciens;
    }


    public void setAcademiciens(List<Academicien> academiciens) {
        this.academiciens = academiciens;
    }


    public Projet() {
      
    }


    public Integer getId_projet() {
        return id_projet;
    }


    public void setId_projet(Integer id_projet) {
        this.id_projet = id_projet;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Date getDate_debut() {
        return date_debut;
    }


    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }


    public Date getDate_fin() {
        return date_fin;
    }


    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }


   

    
}
