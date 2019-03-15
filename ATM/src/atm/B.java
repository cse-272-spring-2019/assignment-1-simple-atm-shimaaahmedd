package atm;
import java.util.LinkedList;
public class B {
	public static double balance;
	public static int i;
	public static LinkedList<String> his;
	public static void hello()
	{   LinkedList<String> hey = new LinkedList<>();
		hey.add("Nothing");
	    hey.add("Nothing");  //this is for initializing the history list & make it global
		hey.add("Nothing");
		hey.add("Nothing");
		hey.add("Nothing");
		B.his=hey;
		B.i=4;
	}
}
