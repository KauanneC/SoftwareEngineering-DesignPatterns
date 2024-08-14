package command;

public class RemoteControlTest {

	public static void main(String[] args) {
		Backup backup = new Backup();

		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// Luz
		Light light = new Light();
		LightCommand lightOn = new LightCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		// Portão da garagem
		GarageDoor garage = new GarageDoor();
		GarageDoorCommand garageOn = new GarageDoorCommand(garage);
		

		remote.setCommand(garageOn);
		remote.buttonWasPressed();
		
		// Som
		Sound sound = new Sound();
		SoundCommand soundOn = new SoundCommand(sound);

		remote.setCommand(soundOn);
		remote.buttonWasPressed();
		
		// Jacuzi
		Hottub hottub = new Hottub();
		HottubCommand hottubOn = new HottubCommand(hottub);

		remote.setCommand(hottubOn);
		remote.buttonWasPressed();

		System.out.println("\nFaltou Energia!!\n");
		
		System.out.println("Realizando backup..");

		backup.load();
		
	}
}
