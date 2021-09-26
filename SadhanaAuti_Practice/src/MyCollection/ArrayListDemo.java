package MyCollection;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	
 void methodArray() {
	 int[] arr = new int[9]; //5 Bydeafult arry 0
	 arr[0]=64;
	 arr[1]=16;
	 arr[2]=25;
	 arr[10]=55;
	 //	 System.out.println(arr[0]);
	 //System.out.println(arr[1]);
    // System.out.println(arr[3]);
	 //System.out.println(arr[i]);
	 for (int i=0; i<arr.length; i++)
	 {
		 System.out.println(arr[i]);
	 }
 }
  public void arrayListExample() {
	 List<Float> objlist = new ArrayList();
	 objlist.add(15.33f);
	 objlist.add(14.34f);
	 objlist.add(16.35f);
	 objlist.add(17.37f);
	  for(float f:objlist) // for each  float f; f>10;f++
	 {
		 System.out.println(f);
	 }
}
  
 public void testarraylist() {
	 ArrayList<Integer> objlist = new ArrayList<Integer>();
	 objlist.add(3);
	 objlist.add(33);
	 objlist.add(333);
	 objlist.add(3333);
	 
	 for(int i=0; i<objlist.size();i++)
	 {
		 System.out.println(objlist.get(i));
	 }
}
 
 public static void main(String[] args) {
	 ArrayListDemo obj = new ArrayListDemo();
	 obj.methodArray();
	 //obj.arrayListExample();
	 //obj.testarraylist();
 }
}

