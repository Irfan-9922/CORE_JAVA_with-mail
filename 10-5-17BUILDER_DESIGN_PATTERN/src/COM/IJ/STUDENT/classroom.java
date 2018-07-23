/**JAVA BOSS @ COPYRIGHTS 2017 
 * 
 */
package COM.IJ.STUDENT;

/**
 * @author :IRFAN
 *TIME:10:40:52 AM
 * DATE:10-May-2017
 *PROJECT:10-5-17BUILDER_DESIGN_PATTERN
 */
public class classroom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		student q=s.setFees(1212).setName("irfan").setRollno(12);
		System.out.println(q);

	}

}
