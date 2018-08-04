
package com.capgemini.parentchild;

/**
 * @author Pooja Karnik Program to demonstrate function overriding
 *
 */
//demonstrating function overriding
class Test {

	// creating child class instance to override the method disp with one or more
	// parameters
	public static void main(String[] args) {

		Child child = new Child();

		child.disp(22);
		child.disp(10, 20);
	}
}
