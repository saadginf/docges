package com.br.ab.docges.entities;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Ordonance {
Long id;
Date dateOrdo;
String typeOrdo;
String observations;
String prescriptions;
@ManyToOne
@JoinColumn(name="ID_VISITE")
Visite visite;
}
