package com.br.ab.docges.entities;

import java.util.Date;
import java.util.List;

public class Visite {
    Long id;
    String type;
    Date dateVisite;
    String motif;
    String diagnostic;
    Facture facture;
    List<Ordonance> ordonances;
    Mesures mesures;
    Patient patient;
}