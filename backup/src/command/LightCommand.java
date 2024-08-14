package command;

import java.io.Serializable;

public class LightCommand implements Command,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Light light;
	
	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public String execute() {
		light.on();
		return "Luz: acesa";
	}

}
