/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package basic;

import java.io.IOException;

import expetion.toold;
import expetion.toyoung;

/**
 * @author :IRFAN
 *TIME:5:40:20 pm
 * DATE:09-Jun-2017
 *PROJECTNAME:6-6-17
 */
public class custumized_exeption {

	/**
	 * @param args
	 * @throws toold 
	 */
	
	public static void re(int a) throws toold {
		int age=a;
		if(age>20)
			throw new toyoung("you wait for the merrage ");
			
	
		else
			throw new toold("old man");
		

	
	}
	public static void main(String[] args) throws toyoung, toold, IOException{
		// TODO Auto-generated method stub
		String s=null;
	
		//System.out.println(	System.inheritedChannel().new char);
		re(2);
		
	}

}
