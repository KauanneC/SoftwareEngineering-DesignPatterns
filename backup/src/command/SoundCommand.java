package command;

public class SoundCommand implements Command{
	
	Sound sound;
	
	public SoundCommand(Sound sound) {
		this.sound = sound;
	}

	@Override
	public String execute() {
		sound.on();
		sound.setDvd();
		return "CD: Existe um DVD no dispositivo";
	}
	
}
