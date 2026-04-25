package edu.teamrocket.golfstrokes;

public class Player {
    
    private final String initials;
    private Byte handicap;
    private Short score;
    private Short points;

    public Player(String initials, Byte handicap){
        this.initials = initials;
        this.handicap = handicap;
    }

    public String getInitials() {
        return this.initials;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    private Short getScore() {
        return score;
    }

    public void setPoints(Short points) {
        this.points = points;
    }

    private Short getPoints() {
        return points;
    }

    public Byte getHandicap() {
        return handicap;
    }

    public String toString(){

        StringBuilder jugador = new StringBuilder();
        jugador.append("Iniciales: ");
        jugador.append(getInitials());
        jugador.append("  Handicap: ");
        jugador.append(getHandicap());
        jugador.append("  Strokes: ");
        jugador.append(getScore());
        jugador.append("  Stableford points: ");
        jugador.append(getPoints());
        return jugador.toString();

    }

}
