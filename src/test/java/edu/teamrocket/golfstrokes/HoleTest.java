package edu.teamrocket.golfstrokes;

import org.junit.jupiter.api.Test;

public class HoleTest {

    @Test
    void toStringTest(){
        Hole hoyo = new Hole((byte)1, (byte)5);
        System.out.println(hoyo);
    }
}
