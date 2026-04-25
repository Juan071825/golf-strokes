package edu.teamrocket.golfstrokes;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    
    @Test
    void ToStringTest(){
        Player jugador = new Player("MJ", (byte)0);
        System.out.println(jugador);
    }
}
