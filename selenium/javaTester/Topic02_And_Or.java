package javaTester;

public class Topic02_And_Or {
	public static void main (String[] args) {
		boolean nam  ;
		boolean nu  ;
		// Phép AND
		// Cả 2 đều đúng thì mới đúng
		nam = true;
		nu = true;
		System.out.println(nam && nu);
	
		nam = true;
		nu = false;
		System.out.println(nam && nu);
		
		nam = true;
		nu = false;
		System.out.println(nam && nu);
		
		nam = false;
		nu = false;
		System.out.println(nam && nu);
		
		//1 trong 2 sai thì nó sẽ sai
		// Cả 2 đều sai thì nó sai
		
		//Phép OR
		//Cả 2 đều đúng thì nó đúng
		//1 trong 2 đúng thì nó đúng
		nam = true;
		nu = true;
		System.out.println(nam || nu);
		
		nam = true;
		nu = false;
		System.out.println(nam || nu);
		
		nam = true;
		nu = false;
		System.out.println(nam || nu);
		
		nam = false;
		nu = false;
		System.out.println(nam || nu);
	}
	
	
}
