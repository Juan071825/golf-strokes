package edu.teamrocket.golfstrokes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    
    private Optional<Player> playerA = Optional.empty();
    private Optional<Player> playerB = Optional.empty();
    private Optional<Player> playerC = Optional.empty();
    private Optional<Player> playerD = Optional.empty();

    private final List<Hole> holes = new ArrayList<Hole>();

    private Course course;

    public ScoreCard(){};

    public void setPlayerA(Player player) {
        this.playerA = Optional.of(player);
    }

    public void setPlayerB(Player player) {
        this.playerB = Optional.of(player);
    }

    public void setPlayerC(Player player) {
        this.playerC = Optional.of(player);
    }

    public void setPlayerD(Player player) {
        this.playerD = Optional.of(player);
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public byte[] getPlayerCourse(Player player){
        return this.course.getPlayerCourse(player);
    }


    List<Player> getPlayers() {
        return Arrays.asList(playerA, playerB, playerC, playerD)
                .stream()
                .filter(player -> player.isPresent())
                .map(Optional::get)
                .toList();
    }



    void addHoles(Byte[] holesPar){
        Byte idHole = 1;
        for (Byte par : holesPar){
            this.holes.add(new Hole(idHole++, par));
        }
    }

    Byte getNumHoles(){

        return (byte)this.holes.size();
    }

    List<Hole> getHoles(){

        return this.holes;

    }
}
