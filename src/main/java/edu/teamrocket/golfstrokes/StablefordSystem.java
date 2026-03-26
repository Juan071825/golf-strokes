package edu.teamrocket.golfstrokes;

enum StablefordSystem {

    TRIPLE_BOGEY(3, -3),
    DOUBLE_BOGEY(2, -3),
    BOGEY(1, -1),
    PAR(0, 0),
    BIRDIE(-1, 2),
    EAGLE(-2, 5),
    ALBATROSS(-3, 8);


    

    private final int strokes;
    private final int points;

    private StablefordSystem(int strokes, int points){

        this.strokes = strokes;
        this.points = points;
    }

    int getPoints() {
        return this.points;
    }

    int getStrokes(){
        return this.strokes;
    }
}
