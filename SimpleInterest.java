package com.anudip;
public class SimpleInterest {
	  public static void main(String[] args) {
	    double principal = 100000;
	    double rate = 5;
	    double time = 3;

	    double interest = (principal * rate * time) / 100;

	    System.out.printf("Simple interest: %.2f%n", interest);
	  }
	}