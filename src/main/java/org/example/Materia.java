package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {

  private String nombre;
  public List<Materia> correlativas = new ArrayList<>();
  public Boolean cumpleCorrelatividad(Alumno alumno){

    return correlativas.stream().allMatch(materia -> alumno.aproboMateria(materia));
  }
}
