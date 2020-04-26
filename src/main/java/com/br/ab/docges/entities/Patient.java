package com.br.ab.docges.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Patient {


    Long id;
    String prenom;
    String nom;
    String sexe;
    Date dateNaissance;
    String tel;
    String adresse;
    String profession;
    String historiqueMaladie;
    List<Visite> vistes;
    List<Rdv> rdvs;
}