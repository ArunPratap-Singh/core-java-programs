package project1;

import java.util.ArrayList;

public class ScoreBoard {

    private ArrayList<RaceResult> results;

    public ScoreBoard() {
        results = new ArrayList<>();
    }

    public void addResult(RaceResult result) {

        results.add(result);
    }

    public void displayScoreBoard() {

        System.out.println("==========================================");
        System.out.println("SCOREBOARD");
        System.out.println("==========================================");

        if (results.isEmpty()) {

            System.out.println("No races played yet.");

        } else {

            for (int i = 0; i < results.size(); i++) {

                System.out.println((i + 1) + ". " + results.get(i));
            }
        }

        System.out.println("==========================================");
    }

    public int getTotalScore() {

        int total = 0;

        for (RaceResult result : results) {
            total += result.getScore();
        }

        return total;
    }
}
