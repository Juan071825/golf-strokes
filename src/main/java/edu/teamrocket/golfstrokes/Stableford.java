package edu.teamrocket.golfstrokes;

import java.util.List;

public class Stableford implements GolfPlay {
    
    public void scoring(ScoreCard scoreCard){

        List<Player> players = scoreCard.getPlayers();

        for (Player player : players){

            Byte idHole = 1;
            int score = 0;

            for(Byte holeStrokes : scoreCard.getPlayerCourse(player)){

                Byte par = (byte)(holeStrokes - scoreCard.getHoles().get(idHole).getPar());

                switch(par) {
                    case 3 : score += StablefordSystem.TRIPLE_BOGEY.getPoints();
                    case 2 : score += StablefordSystem.DOUBLE_BOGEY.getPoints();
                    case 1 : score += StablefordSystem.BOGEY.getPoints();
                    case 0 : score += StablefordSystem.PAR.getPoints();
                    case -1 : score += StablefordSystem.BIRDIE.getPoints();
                    case -2 : score += StablefordSystem.EAGLE.getPoints();
                    case -3 : score += StablefordSystem.ALBATROSS.getPoints(); 
                }
            }
            player.setPoints((short)score);
        }
    }
}
