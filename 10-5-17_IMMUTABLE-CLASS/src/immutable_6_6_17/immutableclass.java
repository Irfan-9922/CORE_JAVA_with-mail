/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package immutable_6_6_17;

/**
 * @author :IRFAN
 *TIME:3:15:01 pm
 * DATE:06-Jun-2017
 *PROJECTNAME:10-5-17_IMMUTABLE-CLASS
 */
//make class as a final
public final class immutableclass {
	//defimne all the field private and final
	private final int no;
	private final String name;
	/**
	 * @param no
	 * @param name
	 */
	public immutableclass(int no, String name) {
	
		this.no = no;
		this.name = name;
	}
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	//create cunstructor
	//define nethod
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "immutableclass [no=" + no + ", name=" + name + "]";
	}
	

}
