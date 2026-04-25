package edu.teamrocket.golfstrokes;

public class StrokePlay implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard){

        for (Player player : scoreCard.getPlayers()){
            
            int score = 0;

            for (Byte holeStrokes : scoreCard.getPlayerCourse(player)){

                score += holeStrokes;

            }
            player.setPoints((short)score);
        }
    }
}
