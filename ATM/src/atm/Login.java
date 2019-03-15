package atm;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Login{
	Scene first,second;
	User user=new User();
	Stage stage;
	homescreen homescreen;
	public void login() {
		BorderPane bp = new BorderPane();
		Group hb = new Group();
        bp.setPadding(new Insets(20,140,70,150));
        bp.setStyle("-fx-background-color: #ADD8E6;");
        bp.setCenter(hb);
        Text txt=new Text("Account Number");
        txt.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,12));
        txt.setFill(Color.WHITE);
        txt.setLayoutX(7);
        txt.setLayoutY(10);
        TextField txt1=new TextField();
        txt1.setLayoutX(7);
        txt1.setLayoutY(20);
        Text text=new Text("Password");
        text.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,12));
        text.setFill(Color.WHITE);
        text.setLayoutX(7);
        text.setLayoutY(60);
        PasswordField txt2=new PasswordField();
        txt2.setLayoutX(7);
        txt2.setLayoutY(70);
        Text v=new Text();
        v.setLayoutX(10);
        v.setLayoutY(107);
        Button b=new Button("Login");
        b.setLayoutX(110);
        b.setLayoutY(100);
        b.setStyle("-fx-background-color: #4682B4; -fx-text-fill:#FFFFFF;");
        
        hb.getChildren().addAll(txt,txt1,text,txt2,b,v);
       b.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent event){
        		String accNum=txt1.getText();
        		String pass=txt2.getText();
        	    boolean valid=user.isValidcard(accNum,pass);
        		if(valid==false){
        		v.setText("Invalid");
        		v.setFont(Font.font("TimesRoman",10));
                v.setFill(Color.RED);}
                else{
                	stage.setScene(homescreen.getScene());
                }
        	
        	}});            
		first=new Scene(bp,500,300);
	}
	public Scene getScene(){
        return this.first;
	}
	public void setHomescreen(homescreen homescreen){
		this.homescreen=homescreen;
	}
	public Login(Stage stage){
		this.stage=stage;
	}
}
