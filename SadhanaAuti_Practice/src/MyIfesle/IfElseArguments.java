package MyIfesle;

public class IfElseArguments {

	public static void main(String[] args) {
		if(args.length < 1) 
			System.out.println("No arguments provide");
		else
			for(String arg : args)
				System.out.println("arguments");
		
	}

}
