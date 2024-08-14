package command;

public class SecurityControlCommand implements Command{
	
	SecurityControl securityControl;
	
	public SecurityControlCommand(SecurityControl securityControl) {
		this.securityControl = securityControl;
	}

	@Override
	public String execute() {
		securityControl.arm();
		return "Alarme: ligado";
	}
}
