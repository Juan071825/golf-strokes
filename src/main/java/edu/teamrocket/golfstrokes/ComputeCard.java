package edu.teamrocket.golfstrokes;

public class ComputeCard {
    
    private final ScoreCard scoreCard;
    private final GolfPlay strategy;

    public ComputeCard(ScoreCard scoreCard, GolfPlay golfPlay){
        this.scoreCard = scoreCard;
        this.strategy = golfPlay;
    }

    public void compute(){

        this.strategy.scoring(this.scoreCard);

    }

} 
