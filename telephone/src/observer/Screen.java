package observer;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen{
	private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }
    
    public void printCompletNumber() {
    	if (model.getDigits().size() == 12) {			
			String message = "Agora discando ";
			for (int digit : model.getDigits()) {
				message += digit;
			}
			message += "...";
			System.out.println(message);
		}
    }
    
    public void printDigit(int newDigit) {
        System.out.println(newDigit);
    }
}
