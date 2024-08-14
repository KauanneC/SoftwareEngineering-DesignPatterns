package command;

public class HottubCommand implements Command{
	
	Hottub hottub;
	
	public HottubCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public String execute() {
		hottub.jetsOff();
		return "Jacuzzi: desligada";
	}
}
