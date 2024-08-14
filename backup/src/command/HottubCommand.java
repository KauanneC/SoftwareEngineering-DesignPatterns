package command;

public class HottubCommand implements Command{
	
	Hottub hottub;
	
	public HottubCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public String execute() {
		hottub.circulate();
		hottub.jetsOn();
		return "A jacuzzi estava ligada";
	}
}
