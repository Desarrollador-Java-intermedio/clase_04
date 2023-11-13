
package com.mycompany.actividad_04.modelo;


public class EstadoEnAuge implements CancionableConEstado{

      @Override
    public String mostrarIcono() {
        return "Rocket 🚀";
    }

    @Override
    public String mostrarLeyenda(Cancion cancion) {
        return cancion.getArtista() + " - " + cancion.getTitulo() + " - " + cancion.getAlbum();
    }

    @Override
    public CancionableConEstado siguienteEstado(int reproducciones, int meGusta, int noMegusta,  boolean valor) {
        if (reproducciones > (50000) && meGusta >20000) {
            return new EstadoEnTendencia();
        }else if(noMegusta > 5000){
            return new EstadoNormal();
        }
        return this;
    }
    
}
