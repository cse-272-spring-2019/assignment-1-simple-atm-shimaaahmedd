package atm;

import javafx.application.Application;
import javafx.stage.Stage;

public class mainGUI extends Application{
	@Override
	public void start(Stage wel) throws Exception {
		wel.setTitle("Welcome to ATM!");
		Login login=new Login(wel);
		homescreen homescreen=new homescreen(wel);
		login.login();
		homescreen.screen();
		login.setHomescreen(homescreen);
		 wel.setScene(login.getScene());
		 wel.show();
	}
	
public static void main(String[] args) {
	    B.hello();
		Application.launch(args);
 }
}
