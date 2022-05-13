package containDuplicate;

public class Main {
	
	public static void main(String[]args) {
		int k[]= {1,2,3,1};
		ContainDuplicate containDuplicate=new ContainDuplicate();
		Boolean b= containDuplicate.containDuplicateNumber(k);
		System.out.println(b);
	}

}
