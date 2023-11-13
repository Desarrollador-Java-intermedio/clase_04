package com.mycompany.actividad_04.modelo;

public interface CancionableConEstado {

    String mostrarIcono();

    String mostrarLeyenda(Cancion cancion);

    CancionableConEstado siguienteEstado(int totalReproducciones, int totalMegusta, int totalNoMegusta, boolean reproducidadentro24Horas);

}
