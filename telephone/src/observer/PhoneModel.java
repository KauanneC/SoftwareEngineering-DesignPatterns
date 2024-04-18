package observer;

import java.util.ArrayList;
import java.util.List;

public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<PhoneObserver> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }
    
    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(int newDigit) {
        for (PhoneObserver observer : observers) {
            observer.alert(newDigit);
        }
    }
}
