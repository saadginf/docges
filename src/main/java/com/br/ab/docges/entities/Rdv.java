package com.br.ab.docges.entities;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Rdv {
    Long id;
    Date dateRdv;
    int heureRdv;
    int minRdv;
    String type;
    Boolean honore;
    @ManyToOne
    @JoinColumn(name="ID_PATIENT")
    Patient patient;
}