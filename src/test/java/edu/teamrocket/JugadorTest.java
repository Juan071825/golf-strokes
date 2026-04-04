package edu.teamrocket;

import org.junit.jupiter.api.Test;

public class JugadorTest {
    
    @Test
    void ToStringTest(){
    Jugador jugador = new Jugador("MJ", (byte)0);
    System.out.println(jugador);
    }
}
