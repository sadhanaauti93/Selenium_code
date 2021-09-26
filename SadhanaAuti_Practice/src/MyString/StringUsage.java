package MyString;

public class StringUsage {
	//String TestChar ="yyssoyees";
	String repeat="";
	public void CheckCharRepeat(String TestChar)
	{
		for(int i=0; i<TestChar.length()-1; i++)
		{
			String tempchar="";
			int count=0;
			char temp =TestChar.charAt(i);
			tempchar= tempchar+temp; // same character in string format

			if(repeat.contains(tempchar))
			{
				// Since we do not have to do anything if character is already present in repeat sting,
				// so leaving this if block blank.
			}

			else 
			{ 
				for(int j =i+1; j<TestChar.length();j++)
				{
					if(temp==TestChar.charAt(j))
					{
						count = count +1;
						repeat = repeat+ temp;
					}
				}
			}

			if(count>0)
			{
				System.out.println(temp + " is repeated " + (count+1));
			}
		}
	}
	public static void main(String[] args)
	{
		StringUsage obj = new StringUsage();
		
		obj.CheckCharRepeat("CRICKET FUNNY GAME CCC III");
	}

}
