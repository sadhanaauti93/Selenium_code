package MyInterface1;

public class MyDTHPack {
	public void PackageRate(String PName) {
		if (PName == "ChildPack") {
			}
		System.out.println("You Selected child pack with charges applied  as " + 100);
	}
	public void SportsPack(String PName) {
		if (PName == "Sports") {
			}
		System.out.println("You Selected child pack with charges applied  as " + 100);
}
	public void RegionalPack() {
		}
	public static void main(String[] args) {
		MyDTHPack obj = new MyDTHPack();
		obj.PackageRate("ChildPack");
	}


}
