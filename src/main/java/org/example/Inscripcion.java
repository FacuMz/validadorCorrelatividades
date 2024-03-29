package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

  public Alumno alumnoAInscribir;
  public List<Materia> asignaturas = new ArrayList<>();

  public Boolean aprobada(){
    return asignaturas.stream().allMatch(asignatura -> asignatura.cumpleCorrelatividad(alumnoAInscribir) );
  }
}