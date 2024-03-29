package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

  private String nombre;
  private String apellido;
  private String legajo;
  public List<Materia> materiasAprobadas = new ArrayList<>();

  public Boolean aproboMateria(Materia materia){
    return materiasAprobadas.contains(materia);
  }
}
