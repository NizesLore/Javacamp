package oopIntro;

public class Product {
	
	//constructor
	public Product() {
		System.out.println("Ben �al��t�m");
	}
    //overloading- birden fazla olu�turma-a��r� y�klenme 
	public Product(int id,String name,double unitPrice,String detail) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
