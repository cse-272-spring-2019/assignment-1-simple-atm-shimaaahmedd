package atm;
import java.util.LinkedList;
import java.util.*;
public class Linkedlist {
	LinkedList<String> hiso = new LinkedList<>();
	public static Scanner scanner=new Scanner(System.in);
	private LinkedList<String> history;
	public void setHistory(LinkedList<String> hist){
	B.his.addAll(hist);
	B.his.removeFirst();
		this.history=B.his;
	}
    public LinkedList<String> getHistory(){
		return history;
  }
    public String nextPrev(String n){
		String l;
		if(n.equals("Next")&&B.i<4){
		 l=B.his.get(++B.i);
			return l;
		}
		else if(n.equals("Next")&&B.i==4){
			l=B.his.get(4);
				return l;}
		else if(n.equals("Previous")&&B.i>0){
		 l=B.his.get(--B.i);
			return l;
		}
		else if((n.equals("Previous")&&B.i==0))
		{
		l=B.his.get(0);
			return l;
		}
		
		else {
			l="Nothing";
			return l;
			}
    }
}

    
    


