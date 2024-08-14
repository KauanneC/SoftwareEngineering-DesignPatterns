package command;

public class SimpleRemoteControl {
	
	Command slot;
	
	private Backup backup = new Backup();
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
	 	backup.store(slot.execute());
	}
}
