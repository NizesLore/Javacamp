package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu="�nternet �ubesine gir";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade_=36;
		boolean dustuMu=false;
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
			
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar y�kseldi resmi");
						
		}else {
			System.out.println("Dolar e�ittir resmi");
			
		}
		
		String kredi1="H�zl� kredi";
		String kredi2="Mutlu emekli kredisi ";
		String kredi3="Konut kredisi";
		String kredi4="�ift�i kredisi";
		String kredi5="Msb kredisi";
		String kredi6="Meb kredisi";
		String kredi7="K�lt�r bakanl��� kredisi";
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		
		String[] krediler= {
				"H�zl� kredi",
				"Mutlu emekli kredisi ",
				"Konut kredisi",
				"�ift�i kredisi",
				"Msb kredisi",
				"Meb kredisi",
				"K�lt�r bakanl��� kredisi"
										
		};
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		System.out.println(sehir1);
		
		
		
    System.out.println("Te�ekk�rler");
    
    

	}

}
