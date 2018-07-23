/**JAVA BOSS @ COPYRIGHTS 2017 
 * 
 */
package personalinfo;

/**
 * @author :IRFAN
 *TIME:11:01:58 AM
 * DATE:10-May-2017
 *PROJECT:10-5-17BUILDER_DESIGN_PATTERN
 */
public class zensar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empenfo e=new empenfo();
		empenfo d=e.setCompanyname("tcs").setFname("irfan").setManme("jarina").setLoc("hyd");
		System.out.println(d.getinfo());

	}

}
