
public class ArrayEx {

	public static void main(String[] args) {
		//Array 1st way
		String [] name={"Jyoti","Shravan","Suhasini","Supriya","Vaibhav"};
		
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
       //Array 2nd way
		int [] empId=new int[7];//n=7 .... 0,1....n-1
		
		empId[0]=34;
		empId[6]=20;
		
		for(int i=0;i<empId.length;i++){
			System.out.println(empId[i]);
		}
	}

}
