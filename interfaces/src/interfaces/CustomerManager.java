package interfaces;

public class CustomerManager {
	
	
	private Logger[] loggers;
		
    public CustomerManager(Logger[] loggers) { //loosly coupled
		this.loggers = loggers;
	}
	//loosly-tightly coupled
	public void add(Customer customer) {
		System.out.println("M��teri eklendi  " + customer.getFirstName());
		
			// Utils utils=new Utils();  .....static yap�ld�,new e gerek yok
		Utils.runLoggers(loggers, customer.getFirstName());
			
		
	}
	public void delete (Customer customer) {
		System.out.println("M��teri silindi :" + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		
		
		
		
		
		//DatabaseLogger logger=new DatabaseLogger();    TIGHTLY COUPLED
		//logger.log(customer.getFirstName()  + ":  veri taban�na logland�");
	}
}
