import java.util.Arrays;

public class FootballMatch  {
    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
        //match.setStatus(MatchStatus.ONGOING);
        try {
            match.setScore(0,1);
        }catch (UnchangeableStatus ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(Arrays.toString(match.getScore()));
    }

//---------------------------Implementation----------------------------------------

    public enum MatchStatus{
        HAS_NOT_STARTED ,
        ONGOING,
        FINISHED;
    }
    private MatchStatus status;
    private int[] score ;

    //initialising block because the score array has
    // to be initialised regardless of which constructor is used.
    {
        score = new int[2];
    }

    public FootballMatch() {
        this.status = MatchStatus.HAS_NOT_STARTED;
    }
    public FootballMatch(MatchStatus status) {
        this.status = status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }
    public void setScore(int team1Goals , int team2Goals) throws UnchangeableStatus {
        if(this.status != MatchStatus.ONGOING)
            throw new UnchangeableStatus("Error : Cannot change the score of a match unless it's status is Ongoing");
        this.score[0] = team1Goals;
        this.score[1] = team2Goals;
    }

    public int[] getScore() {
        return score;
    }

    public static class UnchangeableStatus extends Exception{
        public UnchangeableStatus(String message) {
            super(message);
        }
    }
}
