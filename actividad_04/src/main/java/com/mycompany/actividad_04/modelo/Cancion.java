package com.mycompany.actividad_04.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cancion {

    private String artista;
    private String album;
    private String titulo;
    private CancionableConEstado estado = new EstadoNormal();
    private int totalReproducciones;
    private int totalMegusta;
    private int totalNoMegusta;
    private boolean reproducidadentro24Horas;

    public Cancion(String artista, String album, String titulo) {
        this.artista = artista;
        this.album = album;
        this.titulo = titulo;
    }

    private String mostrarLeyenda() {
        return estado.mostrarLeyenda(this);
    }

    private String mostrarIcono() {
        return estado.mostrarIcono();
    }

    private void mostrarEstado() {
        System.out.println(mostrarLeyenda());
        System.out.println(mostrarIcono());
    }

    private void cambiarEstado() {
        final CancionableConEstado siguienteEstado = estado.siguienteEstado(this.getTotalReproducciones(), this.totalMegusta, this.totalNoMegusta, this.reproducidadentro24Horas);
        if (!this.estado.equals(siguienteEstado)) {
            this.setEstado(siguienteEstado);
        }
    }

    public void reproducirCancion() {
        this.totalReproducciones++;
        cambiarEstado();
        mostrarEstado();
    }
}
