package com.assignments.day13.Generics;

public class Maximum<T extends Comparable<T>> {
	 T x,y,z;

	    public Maximum(T x,T y,T z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }
	    public T maximum() {
	        return Maximum.maximum(x,y,z);
	    }
	    public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
	        T max = x;
	        if (y.compareTo(max) > 0) {
	            max = y;
	        }
	        if (z.compareTo(max) > 0) {
	            max = z;
	        }
	        printMax(x,y,z,max);
	        return max;
	    }
	    public static <T> void printMax(T x,T y,T z,T max) {
	        System.out.println("Max of "+x+", "+y+" and "+z+" is : "+max+"\n");
	    }

  public static void main(String[] args) {
	  System.out.println("Test Case 1: Max String At 1st Position.");
	  Maximum<String> m1=new Maximum<String>("Peach","Apple","Banana");
	  m1.maximum();
	  System.out.println("Test Case 2: Max String At 2nd Position.");
	  Maximum<String> m2=new Maximum<String>("Apple","Peach","Banana");
	  m2.maximum();
	  System.out.println("Test Case 3: Max String At 3rd Position.");
	  Maximum<String> m3=new Maximum<String>("Apple","Banana","Peach");
	  m3.maximum();
  }
}
