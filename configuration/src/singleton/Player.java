package singleton;

public class Player {

	public static void main(String[] args) {
		
		Configure player1 = Configure.getInstance();
		System.out.println(player1.toString());
		
		Configure player2 = Configure.getInstance();
		System.out.println(player2.toString());
		
		System.out.println(player1.equals(player2));
		System.out.println(player1.getUserName());
	}
}
