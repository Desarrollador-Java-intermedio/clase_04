
package com.mycompany.actividad_04.modelo;


public class EstadoEnTendencia implements CancionableConEstado{
  @Override
    public String mostrarIcono() {
        return "Fire 🔥";
    }

    @Override
    public String mostrarLeyenda(Cancion cancion) {
        return cancion.getArtista() + " - " + cancion.getTitulo() + " - " + cancion.getAlbum();
    }

    @Override
    public CancionableConEstado siguienteEstado(int reproducciones, int meGusta, int noMegusta, boolean valor) {
        if (!valor) {
            return new EstadoNormal();
        }
        return this;
    }
    
}
