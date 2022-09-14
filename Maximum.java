package com.assignments.day13.Generics;

import java.util.*;

public class Maximum<T extends Comparable<T>> {
	 T a,b,c,d,e;
	 List<T> list = new ArrayList<T>();
	    public void sortList() {
	        Maximum max = new Maximum(1, 2, 3, 4, 5);
	        max.list.add(this.a);
	        max.list.add(this.b);
	        max.list.add(this.c);
	        max.list.add(this.d);
	        max.list.add(this.e);

	        Collections.sort(max.list);
	        System.out.println(max.list);
	    }

	    public Maximum(T a,T b,T c,T d,T e) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.d = d;
	        this.e = e;
	    }
	    public T maximum() {
	        return Maximum.maximum(a,b,c,d,e);
	    }
	    public static <T extends Comparable<T>> T maximum(T a,T b,T c,T d,T e) {
	        T max = a;
	        if (b.compareTo(max) > 0) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }
	        if (d.compareTo(max) > 0) {
	            max = d;
	        }
	        if (e.compareTo(max) > 0) {
	            max = e;
	        }
	        printMax(a,b,c,d,e,max);
	        return max;
	    }
	    public static <T> void printMax(T a,T b,T c,T d,T e,T max) {
	        System.out.println("\n"+"Max of " + a + ", " + b + ", " + c + ", " + d + " and " + e + " is : "+max);
	    }

  public static void main(String[] args) {
	  
	  Maximum<Integer> m1=new Maximum<Integer>(8,9,12,4,6);
	  m1.maximum();
	  m1.sortList();
	  
	  Maximum<Float> m2=new Maximum<Float>(10.1f,20.2f,5.5f,6.6f,30.3f);
	  m2.maximum();
	  m2.sortList();
	  
	  Maximum<String> m3=new Maximum<String>("Apple","Banana","Peach","Mango","Grape");
	  m3.maximum();
	  m3.sortList();
  }
}
