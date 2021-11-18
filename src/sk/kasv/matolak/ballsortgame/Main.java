package sk.kasv.matolak.ballsortgame;

public class Main {
    public static void main(String[] args) {
        int[][] map = {
                {1, 2, 4, 2, 0, 0},
                {2, 4, 1, 1, 0, 0},
                {1, 3, 2, 4, 0, 0},
                {3, 3, 3, 4, 0, 0},
        };
        for (int i = 0 ;i < 4;i++) {
            for (int j = 0; j < 6; j++) {
                if (map[i][j] == 0) {
                    System.out.print(" | | ");
                } else {
                    System.out.print(" |" + map[i][j] + "| ");
                }
            }
            System.out.println();
        }
    }
}