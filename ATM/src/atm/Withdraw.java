package atm;
import java.util.*;
public class Withdraw {
	public static Scanner scanner = new Scanner(System.in);
	private double withdrawn;
	public double getWithdrawn(){
		return withdrawn;
	}
	public void setWithdrawn(double with){
		this.withdrawn=with;
	}	
	public LinkedList<String> inputW(){
	    String sentence="Withdraw of amount:";
	    String with=Double.toString(getWithdrawn());  
	    String histo=sentence+with;
	    LinkedList<String> f = new LinkedList<>();
	    f.add(histo);
	    return f;
	} 
	public void wi(double with){
		Linkedlist l=new Linkedlist();
		B.balance-=with;
	    setWithdrawn(with);
	    l.setHistory(inputW());
	   
		
	}
	public boolean withd(double d){
		if(d>B.balance||d<0){
			return false;
		}
		else {
			wi(d);
        return true;
		}
			
	}
}
