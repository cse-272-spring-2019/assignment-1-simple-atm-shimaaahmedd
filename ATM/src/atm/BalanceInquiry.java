package atm;

import java.util.LinkedList;
public class BalanceInquiry {
    
	private double balance;
	public double getBalance(){
		return balance;
	}
	public void setBalance(double bal){
		this.balance=bal;
	}
	public LinkedList<String> inputB(){
	String sent="Balance Inquiry Of Amount:";
	String hist=sent+B.balance;
	setBalance(B.balance);
    LinkedList<String> b = new LinkedList<>();
    b.add(hist);
    return b;
}
	public String hey(){
		inputB();
		Linkedlist l =new Linkedlist();
		l.setHistory(inputB());
		double f =getBalance();
		String bal= String.valueOf(f);
		return bal;
	}
} 

