/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.demo;

/**
 * @author :IRFAN
 *TIME:3:44:02 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17SIgletone
 */
//create a class
//create object withs static 
//make cunstructor as private so it ca be instatia only once
//wrte one static method that return object of that calss

public class singletone {
	
private static singletone si=new singletone();
/**
 * 
 */
private singletone() {
	// TODO Auto-generated constructor stub
}
public static singletone getinstense(){
	if(si!=null){
		return null;
	}
	else{
		return si;
	}
}
public static void hello(){
	System.out.println("from sngletone");
	
}

}
