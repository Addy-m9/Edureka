package Day4;

public class DemoGuru99 {
	
	
	public static void main(String[] args) {
		
		
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		guru.login("mngr180343", "babYbAt");
		guru.newCustomer();
		String cusd=guru.getCustomerID();
		
		
		
		System.out.println("customer"+cusd);
		guru.addAccount(cusd);
		
		
	}
	
	
	

}
