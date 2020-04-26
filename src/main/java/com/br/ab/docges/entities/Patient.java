package com.br.ab.docges.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Patient implements Serializable {

    @Id
    private Long id;
    private String cin;
    private String prenom;
    private String nom;
    private String sexe;
    private Date dateNaissance;
    private String tel;
    private String email;
    private String adresse;
    private String profession;
    private String sitFam;
    private String antecedantMaladie;
    
    @OneToMany(mappedBy="patient")
    private List<Visite> vistes;
    
    @OneToMany(mappedBy="patient")
    private List<Rdv> rdvs;

    public Patient(String cin, String prenom, String nom, String sexe, String tel) {
        this.cin = cin;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.tel = tel;
    }
    public Patient() {
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSitFam() {
        return sitFam;
    }

    public void setSitFam(String sitFam) {
        this.sitFam = sitFam;
    }

    public String getAntecedantMaladie() {
        return antecedantMaladie;
    }

    public void setAntecedantMaladie(String antecedantMaladie) {
        this.antecedantMaladie = antecedantMaladie;
    }

    public List<Visite> getVistes() {
        return vistes;
    }

    public void setVistes(List<Visite> vistes) {
        this.vistes = vistes;
    }

    public List<Rdv> getRdvs() {
        return rdvs;
    }

    public void setRdvs(List<Rdv> rdvs) {
        this.rdvs = rdvs;
    }
}