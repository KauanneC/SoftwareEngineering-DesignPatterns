package observer;

public class NumberCompleteObserver implements PhoneObserver{
	
	private final Screen screen;
	
	public NumberCompleteObserver(Screen screen) {
        this.screen = screen;
    }
	
	@Override
	public void alert(int newDigit) {
		screen.printCompletNumber();
	}
}
