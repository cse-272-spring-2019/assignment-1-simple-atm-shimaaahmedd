package atm;
import java.util.*;
public class Deposit {
	public static Scanner scanner = new Scanner(System.in);
	private double deposit;
	public double getDeposit(){
		return deposit;
	}
	public void setDeposit(double dep){
		this.deposit=dep;
	}
	public LinkedList<String> inputD(){
		String sent="Deposit of amount:";
	    String dep=Double.toString(getDeposit());  
	    String hist=sent+dep;
	    LinkedList<String> h = new LinkedList<>();
	    h.add(hist);
	    return h;
	} 
	public void de(double dep){
		Linkedlist l=new Linkedlist();
		B.balance+=dep;
	    setDeposit(dep);
	    l.setHistory(inputD());
	    return ;
		
	}
	public boolean depo(double d){
		if(d<0){
			return false;
		}
		else {
			de(d);
        return true;
		}
	}
}
