package MyAbstraction;

abstract class Car {
	abstract void run();
}
class Honda extends Car{
void run(){
	int i,j;
	i=34;
	j=i+76;
	System.out.println("Running safely on my honda " +(i+j));
	}
}
class Mcelerio extends Car{
	void run(){
		System.out.println("Running safely on my Mcelerio");
	}
}
class MercedesBenz extends Car{
	void run(){
		System.out.println("Running safely on my MercedesBenz");
	}
}
