/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package CUNSTRUCTOR_CHAINING;

/**
 * @author :IRFAN
 *TIME:3:42:49 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:6-6-17WORKING-ON-CUNSTRUCTOR
 */
public class superchaining extends parent{
	superchaining(){
		this(1);
		System.out.println("from superchaining 0 pm cunstructor");
	}
	superchaining(int a){
		this(122,2);
		System.out.println("from superchaining 1 pm cunstructor");
	}
	superchaining(int a,int b){
		super("parent");
		System.out.println("from superchainning 2 pm cunstructor");
	}
	
	

}
