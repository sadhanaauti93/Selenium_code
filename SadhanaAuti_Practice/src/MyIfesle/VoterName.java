package MyIfesle;

public class VoterName {
	String tai;
	//String bai;
	//String sai;
	//String ira;
	public void VoterName(String aai, String bai)
	{
		System.out.println("Check before Name " + aai);
		System.out.println("Check before Name " + bai);
		
		tai=aai;
		aai=bai;
		bai=tai;
		/*
		tai=sai;
		sai=ira;
		ira=tai;
		*/
		
		//System.out.println("Check after Name " + 'sai');
		//System.out.println("Check after Name " + 'ira');
	}
	public static void main(String[] args)
	{
		VoterName obj = new VoterName();
		obj.VoterName("aai", "bai");
		//obj.VoterName('sai', 'ira');
	}
}
