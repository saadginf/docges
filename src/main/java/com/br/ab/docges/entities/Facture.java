package com.br.ab.docges.entities;

import java.util.Date;

import javax.persistence.OneToOne;

public class Facture {
    Long id;
    Date dateFacture;
    double montant;
    Boolean payee;
    @OneToOne(mappedBy = "facture")
    Visite viste;
}
