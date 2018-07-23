/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package CUNSTRUCTOR_CHAINING;

/**
 * @author :IRFAN
 *TIME:3:55:16 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:6-6-17WORKING-ON-CUNSTRUCTOR
 */
 class b {
	b(){
		System.out.println("a");
	}

}
class a extends b{
	a(){
		System.out.println("b");
	}
	public static void main(String[] args) {
		a f=new a();
	}
}
