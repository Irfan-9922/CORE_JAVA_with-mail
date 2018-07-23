/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author :IRFAN
 *TIME:5:41:41 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:6-6-17
 */
public class revers_string  {

	/**
	 * @param args
	 */
	/*static int m1(){
		try{
			System.out.println("inside try");
			
			try{
				System.out.println("inner try");
				System.out.println(10/0);
				return 10;
			}
			catch(NullPointerException m){
				System.out.println("inner catch");
				return 21;
			}
			finally{
				System.out.println("innner finally");
				return 22;
			}
		}
		
		catch(ArithmeticException e){
			System.out.println("inside catch");
			//return 12;
		}
		finally{
			System.out.println("outer finally");
			
		}
		return 07;
		
	}*/
	
	static int m1(){
		try{
			System.out.println("inside try");
			System.out.println(10/0);
			
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("in catch");
		}
		finally{
			System.out.println("in finally");
			
		}
		return 12;
	}
	public static void main(String[] args) {
		System.out.println(m1());
		
		
		/*try{
			System.out.println("inside try");
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("in catch");
		}
		finally{
			System.out.println("in finally");
		}
		System.out.println("agter try");

	}*/
		/*List l=new ArrayList();
		List ll=new ArrayList();
		TreeSet j=new TreeSet(ll);
		// TODO Auto-generated method stub
        String s="irfan";
        //use for loop
        for(int i=s.length()-1;i>=0;i--){
        //	System.out.println("after reversing"+s.charAt(i));
        	l.add(s.charAt(i));
        }
        System.out.println(l);
   
	}*/
		
		
		
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */


	}
}
