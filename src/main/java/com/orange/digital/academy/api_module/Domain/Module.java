package com.orange.digital.academy.api_module.Domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "module")
public class Module {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_module;
    private String nom;
    private Integer statut;
    private Integer id_projet;

    
 

  /*  @OneToMany (mappedBy = "projet")
    private List<Projet> projets;

    public List<Projet> getProjets() {
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }*/

    public Integer getId_projet() {
        return id_projet;
    }

    public void setId_projet(Integer id_projet) {
        this.id_projet = id_projet;
    }

    public Module() {
        
    }

    public Module(Integer id_module, String nom, Integer statut, Integer id_projet) {
        this.id_module = id_module;
        this.nom = nom;
        this.statut = statut;
        this.id_projet = id_projet;
    }

    public Integer getId_module() {
        return id_module;
    }

    public void setId_module(Integer id_module) {
        this.id_module = id_module;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getStatut() {
        return statut;
    }

    public void setStatut(Integer statut) {
        this.statut = statut;
    }

  

    
}
