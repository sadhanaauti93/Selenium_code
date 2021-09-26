package com.cg.project.services;
import com.cg.project.Exception.InvalidNumberRangeException;

public interface MathService {
	int num = 100;
	int add(int n1,int n2)throws InvalidNumberRangeException;
	abstract int sub(int n1, int n2)throws InvalidNumberRangeException;
	public int mul(int n1, int n2)throws InvalidNumberRangeException;
	 public abstract int div(int n1, int n2)throws InvalidNumberRangeException;
	 
	 public default void doSomeWork() {
		 
	 }

}
