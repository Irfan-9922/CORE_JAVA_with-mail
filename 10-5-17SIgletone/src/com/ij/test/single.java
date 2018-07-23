/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

/**
 * @author :IRFAN
 *TIME:3:56:36 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17SIgletone
 */
public class single {
	public static single tone=null;
	/**
	 * 
	 */
	private single() {
		// TODO Auto-generated constructor stub
	}
	public static single getsingletone(){
		if(tone==null){
			return new single();
		}
		else{
			return tone;
		}
	}
	public static void hello(){
		System.out.println("hello");
	}

}
