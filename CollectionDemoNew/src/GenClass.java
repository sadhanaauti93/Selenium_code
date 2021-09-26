

public class GenClass<T,E>{
	private T var1;
	private E var2;
	public GenClass(T var1, E var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}
	public T getVar1() {
		return var1;
	}

	public void setVar1(T var1) {
		this.var1 = var1;
	}

	public E getVar2() {
		return var2;
	}

	public void setVar2(E var2) {
		this.var2 = var2;
	}
	
	
}



