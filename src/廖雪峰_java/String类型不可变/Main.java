package 廖雪峰_java.String类型不可变;

import java.util.Arrays;

/**
 * FileName: Main
 * Date: 2020/10/21 20:34
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();

    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = Arrays.copyOf(scores,scores.length);
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
