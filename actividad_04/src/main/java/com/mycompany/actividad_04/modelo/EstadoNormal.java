package com.mycompany.actividad_04.modelo;


public class EstadoNormal implements CancionableConEstado {

    @Override
    public String mostrarIcono() {
        return "MUSICAL NOTE 🎵";
    }

    @Override
    public String mostrarLeyenda(Cancion cancion) {
        return cancion.getArtista() + " - " + cancion.getTitulo() + " - " + cancion.getAlbum();
    }

    @Override
    public CancionableConEstado siguienteEstado(int reproducciones, int meGusta, int noMegusta, boolean valor) {
        if (reproducciones > 1000) {
            return new EstadoEnAuge();
        }
        return this;
    }

    
}
