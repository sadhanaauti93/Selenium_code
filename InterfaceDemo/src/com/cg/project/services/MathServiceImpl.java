package com.cg.project.services;
import com.cg.project.Exception.InvalidNumberRangeException;

public class MathServiceImpl implements MathService {
	@Override
	public int add(int n1, int n2) throws InvalidNumberRangeException {
		if(n1<0 ||n2<0)
			throw new InvalidNumberRangeException("Enter only positive number");
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2)throws InvalidNumberRangeException {
		if(n1<0 || n2<0)
			throw new InvalidNumberRangeException("Enter only positive number");
		return n1-n2;
	}

	@Override
	public int mul(int n1, int n2)throws InvalidNumberRangeException {
		if(n1<0 || n2<0)
			throw new InvalidNumberRangeException("Enter only positive number");
		return n1*n2;
	}

	@Override
	public int div(int n1, int n2)throws InvalidNumberRangeException {
		if(n1<0 || n2<0)
			throw new InvalidNumberRangeException("Enter only positive number");
		return n1/n2;
	}
}
	
	
//
//	@Override
//	public int add(int n1, int n2) {
//		return 0;
//	}
//
//	@Override
//	public int sub(int n1, int n2) {
//		return 0;
//	}
//
//	@Override
//	public int mul(int n1, int n2) {
//		return 0;
//	}
//
//	@Override
//	public int div(int n1, int n2) {
//		return 0;
//	}

	
	


