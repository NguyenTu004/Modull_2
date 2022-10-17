package bai_4;

public class Refactoring1 {
    static String score = "";
    public String getScore(String player1Name, String player2Name, int play1Score, int play2Score) {
        if (play1Score==play2Score)
        {
            switch (play1Score)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (play1Score>=4 || play2Score>=4)
        {
            checkWin(play1Score, play2Score);
        }
        else
        {
          check(play1Score, play2Score);
        }
        return score;
    }
    public static void checkWin(int play1_score, int play2_score) {
        int minusResult = play1_score-play2_score;
        if (minusResult==1) {
            score = "Advantage player1";
        }
        else if (minusResult ==-1) {
            score = "Advantage player2";
        }
        else if (minusResult>=2) {
            score = "Win for player1";
        }
        else {
            score = "Win for player2";
        }
    }
    public static void check(int play1_score, int play2_score){
        int tempScore;
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = play1_score;
            else { score +="-";
                tempScore = play2_score;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
    }
}
