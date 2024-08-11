package scoresourceevent;
import java.util.*;
public class ScoreEvent extends EventObject {
	String scoreLine;
	public ScoreEvent(Object source, String scoreStr) {
		super(source);
		scoreLine = scoreStr;
	}
	public String getScoreLine() {
		return scoreLine;
	}
}