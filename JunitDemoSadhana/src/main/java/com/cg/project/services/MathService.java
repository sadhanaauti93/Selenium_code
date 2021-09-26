package com.cg.project.services;

import com.cg.project.exceptions.InvalidNumberRangeException;

public interface MathService {
	
	int add(int n1,int n2) throws InvalidNumberRangeException; // by default method is abstract, and public
	abstract int sub(int n1,int n2) throws InvalidNumberRangeException;
	public int multi(int n1, int n2)throws InvalidNumberRangeException;
	public abstract int div(int n1,int ne)throws InvalidNumberRangeException;
	
}
