package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		//Bankada m��teri eklenecek
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());
		

	}

}
