package com.br.ab.docges.entities;

import java.util.Date;

public class Rdv {
    Long id;
    Date dateRdv;
    int heureRdv;
    int minRdv;
    String type;
    Patient patient;
}