/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

public class Jugadores {
    private String jugador;
    private int puntos;
    
    public Jugadores(String jugador, int puntos){
        this.jugador = jugador;
        this.puntos = puntos;
        
    }


    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
