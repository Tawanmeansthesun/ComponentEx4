package scoresourceevent;
public class Subscriber implements ScoreListener {

    @Override
    public void changeScore(ScoreEvent e) {
        System.out.println("live result: " + e.getScoreLine());
    }
    
    
}
