package observer;


public class Main {
    public static void main(String[] args) {

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        model.addObserver(new DigitObserver(screen));
        model.addObserver(new NumberCompleteObserver(screen));
        KeyPad keyPad = new KeyPad(model);

        // Run the program
        keyPad.simulateKeyPresses();
    }
}