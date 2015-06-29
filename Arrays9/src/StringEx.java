
public class StringEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name=new String("Acad..Gild"); //class
		String name1=new String("acadGild"); //class
		
		String str2;
		str2="abc";// dataType
		String str3="abc";// dataType
		String str4="abc";// dataType
		
		
		str3="abc"+"a";//abca
		if(str2==str3){
			System.out.println(true);
		}
		if(name.equalsIgnoreCase(name1)){
			System.out.println("Case Sen : "+true);
		}
		
		System.out.println(name.length());//acadGild
		
		System.out.println(name.substring(0,4));
		
		System.out.println(name.lastIndexOf("Gild"));
		System.out.println(name.toUpperCase());
		
		System.out.println(name.charAt(5));
		
		//case sen		
	
	}

}
