package observer;

public class DigitObserver implements PhoneObserver {
	
	private final Screen screen;
	
	public DigitObserver(Screen screen) {
		this.screen = screen;
	}
	
	@Override
    public void alert(int newDigit) {
        screen.printDigit(newDigit);
    }
}
