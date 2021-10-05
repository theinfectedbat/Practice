package com.test.exceptionHierarchy;

import java.io.IOException;

public class SubClass extends Superclass {
	 
	  // method() declaring Checked Exception IOException
	  void method()  {
	 
	    // IOException is of type Checked Exception
	    // so the compiler will give Error
	 
	    System.out.println("SubClass");
	  }
	 
	  // Driver code
	  public static void main(String args[]) {
	    Superclass s = new SubClass();
	    s.method();
	  }
	}
