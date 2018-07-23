/**JAVA BOSS @ COPYRIGHTS 2017 
 * 
 */
package personalinfo;

/**
 * @author :IRFAN
 *TIME:10:54:47 AM
 * DATE:10-May-2017
 *PROJECT:10-5-17BUILDER_DESIGN_PATTERN
 */
public class empenfo {
//	define all fields
	private String name;
	private String fname;
	private String manme;
	private String wname;
	private String companyname;
	private String profileid;
	private String loc;
	private float sal;
	//create the constructore using fields
	/**
	 * @param name
	 * @param fname
	 * @param manme
	 * @param wname
	 * @param companyname
	 * @param profileid
	 * @param loc
	 * @param sal
	 */
	public empenfo(String name, String fname, String manme, String wname, String companyname, String profileid,
			String loc, float sal) {
		super();
		this.name = name;
		this.fname = fname;
		this.manme = manme;
		this.wname = wname;
		this.companyname = companyname;
		this.profileid = profileid;
		this.loc = loc;
		this.sal = sal;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public empenfo setName(String name) {
		this.name = name;return this;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public empenfo setFname(String fname) {
		this.fname = fname;
		return this;
	}
	/**
	 * @return the manme
	 */
	public String getManme() {
		return manme;
	}
	/**
	 * @param manme the manme to set
	 */
	public empenfo setManme(String manme) {
		this.manme = manme;
		return this;
	}
	/**
	 * @return the wname
	 */
	public String getWname() {
		return wname;
	}
	/**
	 * @param wname the wname to set
	 */
	public empenfo setWname(String wname) {
		this.wname = wname;
		return this;
	}
	/**
	 * @return the companyname
	 */
	public String getCompanyname() {
		return companyname;
	}
	/**
	 * @param companyname the companyname to set
	 */
	public empenfo setCompanyname(String companyname) {
		this.companyname = companyname;
		return this;
	}
	/**
	 * @return the profileid
	 */
	public String getProfileid() {
		return profileid;
	}
	/**
	 * @param profileid the profileid to set
	 */
	public empenfo setProfileid(String profileid) {
		this.profileid = profileid;
		return this;
	}
	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}
	/**
	 * @param loc the loc to set
	 */
	public empenfo setLoc(String loc) {
		this.loc = loc;
		return this;
	}
	/**
	 * @return the sal
	 */
	public float getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public empenfo setSal(float sal) {
		this.sal = sal;
		return this;
	}
	
	
	//write setter and getter
	
/**
 * 
 */
public empenfo() {
	// TODO Auto-generated constructor stub
}
public empenfo getinfo(){
	return new empenfo(name, fname, manme, wname, companyname, profileid, "latur", 1231);
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "empenfo [name=" + name + ", fname=" + fname + ", manme=" + manme + ", wname=" + wname + ", companyname="
			+ companyname + ", profileid=" + profileid + ", loc=" + loc + ", sal=" + sal + "]";
}
}
