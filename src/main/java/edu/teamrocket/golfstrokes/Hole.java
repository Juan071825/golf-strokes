package edu.teamrocket.golfstrokes;

public class Hole {
    
    private final Byte number;
    private final Byte par;

    public Hole(Byte number, Byte par){
        this.number = number;
        this.par = par;
    }


    Byte getNumber(){
        return this.number;
    }

    Byte getPar(){
        return this.par;
    }

    @Override
    public String toString(){
        StringBuilder hoyo = new StringBuilder();
        hoyo.append("Number: ");
        hoyo.append(this.number);
        hoyo.append("  ");
        hoyo.append("Par: ");
        hoyo.append(this.par);
        String stringHoyo = hoyo.toString();
        return stringHoyo;
    }
}
