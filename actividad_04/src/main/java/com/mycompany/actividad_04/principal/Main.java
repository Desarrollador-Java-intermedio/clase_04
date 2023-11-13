package com.mycompany.actividad_04.principal;

import com.mycompany.actividad_04.modelo.Cancion;


public class Main {

    static Cancion cancionUno = new Cancion("Indio", "Lobo Suelto", "Luz Velito");

    public static void main(String[] args) {

        System.out.println("Caso 1");
        cancionUno.setTotalReproducciones(800);
        cancionUno.reproducirCancion();

        System.out.println(" \nCaso 2");
        cancionUno.setTotalReproducciones(1800);
        cancionUno.reproducirCancion();

        System.out.println(" \nCaso 3");
        cancionUno.setTotalReproducciones(50000);
        cancionUno.setTotalMegusta(21000);
        cancionUno.reproducirCancion();

        System.out.println(" \nCaso 4");
        cancionUno.setTotalReproducciones(40000);
        cancionUno.setReproducidadentro24Horas(false);
        cancionUno.reproducirCancion();
    
    }

    public static void reproducirTotalVeces(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Reproduccion " + (i + 1));
            cancionUno.reproducirCancion();
        }
    }
}
