/**JAVA BOSS @ COPYRIGHTS 2017 
 * 
 */
package COM.IJ.STUDENT;

/**
 * @author :IRFAN
 *TIME:10:25:30 AM
 * DATE:10-May-2017
 *PROJECT:10-5-17BUILDER_DESIGN_PATTERN
 */
public class student {
	/**
	 * this design pattern are very usefull when your cunstructor
	 * using more than 3 argument .
	 * this design pattern solve the serval requirment
	 * 1:if some field in argument requird default value then it is not allowd by constructor
	 * 2:onse we define the parameter in constructor we must and shuld pass the argument 
	 * while creating the object
	 * <tt>the soulution is that <strong>builder desing pattern</strong></tt>
	 * it comes under creational design pattern
	 * 
	 */
	//define all the fieldas
	private String name;
	private int rollno;
	private String classs;
	private int fees;
	/**
	 * @return the name
	 */
	//write setter and getter
	//modify setter return type into class type
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public student setName(String name) {
		this.name = name;
		return this;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public student setRollno(int rollno) {
		this.rollno = rollno;
		return this;
	}
	/**
	 * @return the classs
	 */
	public String getClasss() {
		return classs;
	}
	/**
	 * @param classs the classs to set
	 */
	public student setClasss(String classs) {
		this.classs = classs;
		return this;
	}
	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public student setFees(int fees) {
		this.fees = fees;
		return this;
	}
	/**
	 * @param name
	 * @param rollno
	 * @param classs
	 * @param fees
	 */
	public student(String name, int rollno, String classs, int fees) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.classs = classs;
		this.fees = fees;
	}
	
	
	/**
	 * 
	 */
	public student() {
		// TODO Auto-generated constructor stub
	}
	//create one method
	/*public student retrive(){
		return new student(classs, fees, "lkg", fees);
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", classs=" + classs + ", fees=" + fees + "]";
	}

}
