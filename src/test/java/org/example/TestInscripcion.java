package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestInscripcion {

  Alumno unAlumno;
  Alumno otroAlumno;
  Materia materia1;
  Materia materia2;
  Materia materia3;
  Materia materia4;
  Materia materia5;
  Inscripcion unaInscripcion;
  Inscripcion otraInscripcion;

  @BeforeEach
  public void configuracion(){

    unAlumno = new Alumno();
    otroAlumno = new Alumno();
    materia1 = new Materia();
    materia2 = new Materia();
    materia3 = new Materia();
    materia4 = new Materia();
    materia5   = new Materia();
    unaInscripcion = new Inscripcion();
    otraInscripcion = new Inscripcion();

    materia1.correlativas.add(materia2);
    materia1.correlativas.add(materia3);

    materia4.correlativas.add(materia5);

    unAlumno.materiasAprobadas.add(materia2);
    unAlumno.materiasAprobadas.add(materia3);
    unAlumno.materiasAprobadas.add(materia5);

    unaInscripcion.alumnoAInscribir = unAlumno;
    unaInscripcion.asignaturas.add(materia1);
    unaInscripcion.asignaturas.add(materia4);

    otroAlumno.materiasAprobadas.add(materia2);
    otroAlumno.materiasAprobadas.add(materia5);

    otraInscripcion.alumnoAInscribir = otroAlumno;
    otraInscripcion.asignaturas.add(materia1);
    otraInscripcion.asignaturas.add(materia4);
  }


  @Test
  public void seApruebaLaInscripcion(){

    assertTrue(unaInscripcion.aprobada());
  }

  @Test
  public void seDesapruebaLaInscripcion(){

    assertFalse(otraInscripcion.aprobada());
  }


}
