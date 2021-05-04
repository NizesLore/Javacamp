package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		//Bankada müşteri eklenecek
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());
		

	}

}
