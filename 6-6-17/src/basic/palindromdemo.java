/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package basic;

/**
 * @author :IRFAN
 *TIME:5:32:01 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:6-6-17
 */
public class palindromdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the vzriablr and initilize
		//copy tha value in one variable
		//perform oopretion
		int r,temp,sum=0,number=121;
		//take a copy of that number 
		temp=number;
		while(number>0){
			r=number%10;//it gives reminder
			sum=(sum*10)+r;
			number=number/10;
			
		}
		//now you can compare the value 
		
		if(temp==sum){
			System.out.println("enterd number is palindrom ");
		}
		else{
			System.out.println("ented number is nit palindrom");
		}

	}

}
