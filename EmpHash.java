package Core_javaS9;
import java.util.*;

public class EmpHash {
	
	public static void main(String[] args) {
	//	int Emp_ID;
	//	String Emp_name;
		HashMap<Integer,String> emp  =new HashMap<Integer,String>();
		
		emp.put(501, "Amit");
		emp.put(502, "Pramod");
		emp.put(503, "Pranav");
		emp.put(504, "Vinod");
		for(Map.Entry b1:emp.entrySet())
		{
			System.out.println(b1.getValue());  
		}
		
	}

}
