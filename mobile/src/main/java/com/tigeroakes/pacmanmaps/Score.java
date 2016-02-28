package com.tigeroakes.pacmanmaps;

/**
 * Created by sherryyuan on 16-02-28.
 */
public class Score {
    private int InitialScore = 0;
    private int scoreSoFar;
    private static Score instance;

    private Score() {
        scoreSoFar = InitialScore;
    }

    public static Score getInstance(){
        if (instance.equals(null)){
            instance = new Score();
        }
        return instance;
    }

    public void AddScore(int score) {
        scoreSoFar += score;
    }

    public int GetScore() {
        return scoreSoFar;
    }


}