package MyAllOperators;

public class UseOperator {
	public void critoriya(){
		int pcb = 81;
		int pcm = 86;		
		/*
		int math=80;
		int biology=70;
		int physics=75;
		int chemistry=79;
		*/
		if (((pcb>70) || (pcb==80)) && ((pcm>80) || (pcm==85)) && (!(pcb>81) || (pcm>86)))
			
		//if (((math>80) ||(math==80)) &&  ((biology>70) || (biology==75)) && ((chemistry>79) || (chemistry==79)) 
				//&& ((physics>75) || (physics==75)))
		{
			System.out.println("Eligiable for Engineering");
		}
		else
		{
			System.out.println("Eligiable for Medicalsite");
		}
		if(pcb == pcm)
		{
			System.out.println("Both site are not appilcable");
		}
	}
	public static void main(String[] args)
	{
		UseOperator obj = new UseOperator();
		obj.critoriya();
	}
}
