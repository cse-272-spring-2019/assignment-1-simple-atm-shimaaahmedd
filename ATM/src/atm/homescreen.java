package atm;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class homescreen {
	Login login;
	Scene second,third,bu;
	Stage wel,balan,but;
	BalanceInquiry b;
	public void screen(){
	BorderPane ac=new BorderPane();
    ac.setPadding(new Insets(60,160,80,160));
    ac.setStyle("-fx-background-color: #ADD8E6;");
    VBox vp=new VBox();
    vp.setPrefWidth(100);
    vp.setSpacing(10);
    ac.setCenter(vp);
    Button balance=new Button("Balance Inquiry");
    Button withdraw=new Button("Withdraw");
    Button deposit=new Button("Deposit");
    Button previous=new Button("History");
    balance.setMaxWidth(Double.MAX_VALUE);
    withdraw.setMaxWidth(Double.MAX_VALUE);
    deposit.setMaxWidth(Double.MAX_VALUE);
    previous.setMaxWidth(Double.MAX_VALUE);
    vp.getChildren().addAll(balance,withdraw,deposit,previous);
	second=new Scene(ac,500,300);
	balance.setOnAction(new EventHandler<ActionEvent>(){
    	public void handle(ActionEvent event){
    		ba();
    	}});
	withdraw.setOnAction(new EventHandler<ActionEvent>(){
    	public void handle(ActionEvent event){
    		withdrawn();
    	}});
	deposit.setOnAction(new EventHandler<ActionEvent>(){
    	public void handle(ActionEvent event){
    		deposit();
    	}});
	previous.setOnAction(new EventHandler<ActionEvent>(){
    	public void handle(ActionEvent event){
    		next();
    	}});
}
	public void ba(){
		BalanceInquiry b=new BalanceInquiry();
		String bal=b.hey();
		StackPane sp=new StackPane();
		sp.setStyle("-fx-background-color: #00BFFF;");
		Text text= new Text();
		text.setText("Current Balance Amount="+" "+bal);
		text.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,10));
        text.setFill(Color.WHITE);
        sp.getChildren().add(text);
        third=new Scene(sp,200,100);
        Stage balan = new Stage();
        balan.setTitle("Balance Inquiry");
        balan.setScene(third);
        balan.show();
	}
	public void withdrawn(){
		StackPane wd=new StackPane();
		wd.setStyle("-fx-background-color: #00BFFF;");
		Group v=new Group();
		Text text= new Text();
		text.setText("Enter Amount to Withdraw!");
		text.setLayoutX(10);
        text.setLayoutY(0);
		TextField txt=new TextField();
		text.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,10));
        text.setFill(Color.WHITE);
		txt.setPrefWidth(100);
		txt.setLayoutX(10);
        txt.setLayoutY(20);
        Text txt1=new Text();
        txt1.setLayoutX(10);
        txt1.setLayoutY(60);
        Text txt2=new Text();
        txt2.setLayoutX(10);
        txt2.setLayoutY(60);
        Button b=new Button("OK");
        b.setLayoutX(130);
        b.setLayoutY(20);
         b.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent event){
        		Withdraw w=new Withdraw();
        		try {
                   Double.parseDouble(txt.getText());
                    
                } catch (Exception e) {
                	txt1.setText("invalid");
                	txt1.setFont(Font.font("TimesRoman",10));
                    txt1.setFill(Color.RED);
                }
        		if (txt.getText() == null || txt.getText().trim().isEmpty()) {
        		}
        		else{
        		String v= txt.getText();
        		double with=Double.valueOf(v);
        		boolean valid=w.withd(with);
        	if(valid){
        		txt1.setText("You Transaction is Processing..."+"\n"+"Done!");
        	    txt1.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,10));
        	    txt1.setFill(Color.WHITE);
        	}
        		else{
            	txt1.setText("Not Enough Balance");
            	txt1.setFont(Font.font("TimesRoman",10));
                txt1.setFill(Color.RED);}}
        	}});
        v.getChildren().addAll(text,txt,b,txt1,txt2);
        wd.getChildren().addAll(v);
        bu=new Scene(wd,200,100);
	    but = new Stage();
        but.setTitle("Withdrawn!");
	    but.setScene(bu);
	    but.show();	
	
	}
	public void deposit(){
		StackPane wd=new StackPane();
		wd.setStyle("-fx-background-color: #00BFFF;");
		Group v=new Group();
		Text text= new Text();
		text.setText("Enter Amount to deposit!");
		text.setLayoutX(10);
        text.setLayoutY(0);
		TextField txt=new TextField();
		text.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,10));
        text.setFill(Color.WHITE);
		txt.setPrefWidth(100);
		txt.setLayoutX(10);
        txt.setLayoutY(20);
        Text txt1=new Text();
        txt1.setLayoutX(10);
        txt1.setLayoutY(60);
        Text txt2=new Text();
        txt2.setLayoutX(10);
        txt2.setLayoutY(60);
        Button b=new Button("OK");
        b.setLayoutX(130);
        b.setLayoutY(20);
         b.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent event){
        		Deposit d=new Deposit();
        		try {
                   Double.parseDouble(txt.getText());
                    
                } catch (Exception e) {
                	txt1.setText("invalid");
                	txt1.setFont(Font.font("TimesRoman",10));
                    txt1.setFill(Color.RED);
                }
        		if (txt.getText() == null || txt.getText().trim().isEmpty()) {
        		}
        		else{
        		String v= txt.getText();
        		double dep=Double.valueOf(v);
        		boolean valid= d.depo(dep);
        	if(valid){
        		txt1.setText("You Transaction is Processing..."+"\n"+"Done!");
        	    txt1.setFont(Font.font("TimesRoman",FontWeight.EXTRA_BOLD,10));
        	    txt1.setFill(Color.WHITE);
        	}
        		else{
            	txt1.setText("Enter a valid number");
            	txt1.setFont(Font.font("TimesRoman",10));
                txt1.setFill(Color.RED);}}
        	}});
        v.getChildren().addAll(text,txt,b,txt1,txt2);
        wd.getChildren().addAll(v);
        bu=new Scene(wd,200,100);
	    but = new Stage();
        but.setTitle("Deposit!");
	    but.setScene(bu);
	    but.show();	}
	
public void next(){
	BorderPane next=new BorderPane();
    next.setPadding(new Insets(30,0,50,0));
	next.setStyle("-fx-background-color: #00BFFF;");
	Text txt=new Text();
    txt.setFont(Font.font("TimesRoman",10));
    txt.setFill(Color.BLACK);
    txt.setLayoutX(72);
    txt.setLayoutY(75);
	Button n=new Button("Next");
	n.setOnAction(new EventHandler<ActionEvent>(){
	    	public void handle(ActionEvent event){
	    		Linkedlist l=new Linkedlist();
	    		String m=l.nextPrev("Next");
	    		if(m=="Nothing")
	    		{
	    			txt.setText("This is the Recent Transaction");
	    		}
	    		else{
		    		txt.setText(m);	
	    		}
	    	}});
	
	n.setLayoutX(250);
    n.setLayoutY(60);
    n.setMaxWidth(Double.MAX_VALUE);
	Button p=new Button("Previous");
	p.setOnAction(new EventHandler<ActionEvent>(){
    	public void handle(ActionEvent event){
    		Linkedlist l=new Linkedlist();
    		String m=l.nextPrev("Previous");
    		if(m=="Nothing")
    		{
    			txt.setText("No More History");
    		}
    		else{
	    		txt.setText(m);	
    		}
    	}});

	p.setLayoutX(0);
    p.setLayoutY(60);
    p.setMaxWidth(Double.MAX_VALUE);
    Rectangle border=new Rectangle(170,20);
    border.setFill(Color.WHITE);
    border.setLayoutX(70);
    border.setLayoutY(62);
    Group bb=new Group();
    bb.getChildren().addAll(n,p,border,txt);
    next.setCenter(bb);
    bu=new Scene(next,400,100);
    but = new Stage();
    but.setTitle("History!");
    but.setScene(bu);
    but.show();	
 }
	public Scene getScene(){
        return second;
	}
	
	public void setLogin(Login login){
		this.login=login;
	}
	public homescreen(Stage wel) {
		this.wel=wel;
	}
	public Scene getSceneb(){
        return third;
	}
}
	
	    	
