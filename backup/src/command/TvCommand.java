package command;

public class TvCommand implements Command{
	
	Tv tv;
	
	public TvCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public String execute() {
		tv.on();
		tv.setVolume();
		return "Televisão: ligada com o volume em 45";
	}
}
