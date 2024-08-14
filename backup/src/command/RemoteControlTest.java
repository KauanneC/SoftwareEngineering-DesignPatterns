package command;

public class RemoteControlTest {

	public static void main(String[] args) {
		Backup backup = new Backup();

		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// Alarme de Segurança
		SecurityControl alarm = new SecurityControl();
		SecurityControlCommand alarmOn = new SecurityControlCommand(alarm);
		
		remote.setCommand(alarmOn);
		remote.buttonWasPressed();
		
		// Luz
		Light light = new Light();
		LightCommand lightOn = new LightCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		// TV
		Tv television = new Tv();
		TvCommand televisionOn = new TvCommand(television);
		
		remote.setCommand(televisionOn);
		remote.buttonWasPressed();
		
		// Ventilador de Teto
		CeilingFan ceiling = new CeilingFan();
		CeilingFanCommand ceilingOn = new CeilingFanCommand(ceiling);
		
		remote.setCommand(ceilingOn);
		remote.buttonWasPressed();
		
		// Portão da garagem
		GarageDoor garage = new GarageDoor();
		GarageDoorCommand garageOff = new GarageDoorCommand(garage);
		

		remote.setCommand(garageOff);
		remote.buttonWasPressed();
		
		// Som
		Sound sound = new Sound();
		SoundCommand soundOff = new SoundCommand(sound);

		remote.setCommand(soundOff);
		remote.buttonWasPressed();
		
		// Jacuzi
		Hottub hottub = new Hottub();
		HottubCommand hottubOff = new HottubCommand(hottub);

		remote.setCommand(hottubOff);
		remote.buttonWasPressed();

		System.out.println("\nFaltou Energia!!");
		
		System.out.println("Realizando backup...\n");

		backup.load();
		
	}
}
