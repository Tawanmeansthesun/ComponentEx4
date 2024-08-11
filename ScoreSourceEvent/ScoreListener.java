package scoresourceevent;
import java.util.EventListener;
public interface ScoreListener extends EventListener {
	public void changeScore(ScoreEvent e);
}