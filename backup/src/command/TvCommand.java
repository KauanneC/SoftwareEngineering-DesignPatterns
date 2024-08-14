package command;

public class TvCommand implements Command{
	
	Tv tv;
	
	public TvCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public String execute() {
		tv.on();
		tv.setInputChannel();
		return "O canal atual é o 3";
	}
}
