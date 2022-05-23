import java.util.ArrayList;
import java.util.Collections;


public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    public void add(double status) {
        history.add(status);
    }
    public void clear() {
        history.clear();
    }
    public String toString() {
        return history.toString();
    }
    public double maxValue() {
        if (history.size() < 1) {
            return 0;
        }
        return Collections.max(history);
    }
    public double minValue() {
        if (history.size() < 1) {
            return 0;
        }
        return Collections.min(history);
    }
    public double average() {
        double total = 0;
        double average = 0;
        if (history.size() < 1) {
            return 0;
        }
        for (int i = 0; i < history.size(); i++) {
        total += history.get(i);
        average = total / history.size();
        }
        return average;
    }
    
}
