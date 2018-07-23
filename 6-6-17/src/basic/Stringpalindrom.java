/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package basic;

/**
 * @author :IRFAN
 *TIME:5:38:41 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:6-6-17
 */
public class Stringpalindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String re="";
		//use loop
		for(int i=s.length()-1;i>=0;i--){
			re+=s.charAt(i);
		}
		if(re.equals(s)){
			System.out.println("enterd string is palindrom");
		}
		else{
			System.out.println("enterd string is not a palindrom");
		}

	}

}
