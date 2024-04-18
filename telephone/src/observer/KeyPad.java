package observer;

import java.util.Arrays;
import java.util.List;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */

public class KeyPad {
	private final PhoneModel model;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void simulateKeyPresses() {
    	List<Integer> digits = Arrays.asList(0, 8, 1, 9, 9, 9, 8, 8, 7, 7, 6, 6);
        
        for (int i = 0; i < digits.size(); i++) {
            int newDigit = digits.get(i);
            System.out.println("Pressionando: " + newDigit);
            model.addDigit(newDigit);
        }
    }

}