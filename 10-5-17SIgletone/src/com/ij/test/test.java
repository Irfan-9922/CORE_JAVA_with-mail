/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

/**
 * @author :IRFAN
 *TIME:4:00:30 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17SIgletone
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		single s=single.getsingletone();
		s.hello();
		System.out.println(s.hashCode());
		

	}

}
