package command;

public class CeilingFanCommand implements Command{
	
	CeilingFan ceilingFan;
	
	public CeilingFanCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public String execute() {
		ceilingFan.medium();
		return "Ventilado: médio";
	}
}
