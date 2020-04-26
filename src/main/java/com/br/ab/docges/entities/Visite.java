package com.br.ab.docges.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Visite implements Serializable {
    @Id
    Long id;
    String type;
    Date dateVisite;
    String motif;
    String diagnostic;
    String obseravation;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facture_id", referencedColumnName = "id")
    Facture facture;
    
    @OneToMany(mappedBy="visite")
    List<Ordonance> ordonances;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mesures_id", referencedColumnName = "id")
    Mesures mesures;
   
    @ManyToOne
    @JoinColumn(name="ID_PATIENT")
    Patient patient;

    public Visite(String type, Date dateVisite, String motif) {
        this.type = type;
        this.dateVisite = dateVisite;
        this.motif = motif;
    }
    public Visite() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getObseravation() {
        return obseravation;
    }

    public void setObseravation(String obseravation) {
        this.obseravation = obseravation;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public List<Ordonance> getOrdonances() {
        return ordonances;
    }

    public void setOrdonances(List<Ordonance> ordonances) {
        this.ordonances = ordonances;
    }

    public Mesures getMesures() {
        return mesures;
    }

    public void setMesures(Mesures mesures) {
        this.mesures = mesures;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
       
    
}