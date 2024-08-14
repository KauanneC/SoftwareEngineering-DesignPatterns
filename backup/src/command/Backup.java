package command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Backup {

	private String pathSaida = "C:\\Users\\kauan\\workspace-ppoo\\SoftwareEngineering-DesignPatterns\\backup\\src\\backup.txt";

	public Backup() {
	}

	public void store(String estado) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(pathSaida, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			printWriter.println(estado);
			printWriter.close();
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void load() {
		try (BufferedReader br = new BufferedReader(new FileReader(pathSaida))) {
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getPath() {
		return pathSaida;
	}

	public void setPath(String path) {
		this.pathSaida = path;
	}
}
