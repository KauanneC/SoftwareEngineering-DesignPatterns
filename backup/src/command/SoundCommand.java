package command;

public class SoundCommand implements Command{
	
	Sound sound;
	
	public SoundCommand(Sound sound) {
		this.sound = sound;
	}

	@Override
	public String execute() {
		sound.off();
		return "Som: desligado";
	}
	
}
