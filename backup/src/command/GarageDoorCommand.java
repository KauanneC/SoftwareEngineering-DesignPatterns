package command;

public class GarageDoorCommand implements Command{
	
	GarageDoor garagerDoor;
	
	public GarageDoorCommand(GarageDoor garageDoor) {
		this.garagerDoor = garageDoor;
	}

	@Override
	public String execute() {
		garagerDoor.down();
		garagerDoor.stop();
		return "Garegem: Fechado";
	}
}
