/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package basic;

/**
 * @author :IRFAN
 *TIME:4:46:50 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:6-6-17
 */
public class palindromtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take a value
		//copy into one variable
	//	compare both if both are same then it is palindrom else not
		int r,temp,sum=0,n=1231;
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum){
			System.out.println(sum+"number is palindrom");
		}
		else{
			System.out.println(sum+"number is not palindrom");
		}

	}

}
