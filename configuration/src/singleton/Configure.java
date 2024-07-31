package singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Configure {

	private static Configure INSTANCE;
	private String appId;
	private String userName;
	private String language;
	private Byte offline;
	private Byte autoDlc;
	private Integer buildId;
	private String dlcName;
	private Byte updateBd;
	private String signature;
	private String windowInfo;
	private String lvWindowInfo;
	private String applicationPath;
	private String workingDirectory;
	private Byte waitForExit;
	private Byte noOperation;

	private Configure() {
		String path = "C:\\Users\\kauan\\workspace-ppoo\\SoftwareEngineering-DesignPatterns\\configuration\\src\\config.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] temp = line.split("=");
				switch (temp[0]) {
				case "AppId":
					this.appId = temp[1];
					break;
				case "UserName":
					this.userName = temp[1];
					break;
				case "Language":
					this.language = temp[1];
					break;
				case "Offline":
					this.offline = Byte.valueOf(temp[1]);
					break;
				case "AutoDLC":
					this.autoDlc = Byte.valueOf(temp[1]);
					break;
				case "BuildId":
					this.buildId = Integer.valueOf(temp[1]);
					break;
				case "DLCName":
					this.dlcName = temp[1];
					break;
				case "UpdateDB":
					this.updateBd = Byte.valueOf(temp[1]);
					break;
				case "Signature":
					this.signature = temp[1];
					break;
				case "WindowInfo":
					this.windowInfo = temp[1];
					break;
				case "LVWindowInfo":
					this.lvWindowInfo = temp[1];
					break;
				case "ApplicationPath":
					this.applicationPath = temp[1];
					break;
				case "WorkingDirectory":
					if (temp.length > 1 && !temp[1].isEmpty()) {
                        this.workingDirectory = temp[1];
                    } else {
                        this.workingDirectory = "NULL";
                    }
					break;
				case "WaitForExit":
					this.waitForExit = Byte.valueOf(temp[1]);
					break;
				case "NoOperation":
					this.noOperation = Byte.valueOf(temp[1]);
					break;
				default:
					System.out.println("Erro!!");
					break;
				}

				line = br.readLine();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static Configure getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new Configure();
		}

		return INSTANCE;
	}

	public String getAppId() {
		return appId;
	}

	public String getUserName() {
		return userName;
	}

	public String getLanguage() {
		return language;
	}

	public Byte getOffline() {
		return offline;
	}

	public Byte getAutoDlc() {
		return autoDlc;
	}

	public Integer getBuildId() {
		return buildId;
	}

	public String getDlcName() {
		return dlcName;
	}

	public Byte getUpdateBd() {
		return updateBd;
	}

	public String getSignature() {
		return signature;
	}

	public String getWindowInfo() {
		return windowInfo;
	}

	public String getLvWindowInfo() {
		return lvWindowInfo;
	}

	public String getApplicationPath() {
		return applicationPath;
	}

	public String getWorkDirectory() {
		return workingDirectory;
	}

	public Byte getWaitForExit() {
		return waitForExit;
	}

	public Byte getNoOperation() {
		return noOperation;
	}
}
