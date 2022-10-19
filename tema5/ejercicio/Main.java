package tema5.ejercicio;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice motorolaG5 = new SmartDevice("G5", "Motorola", 10.5, 249.99 );
		SmartPhone samsungS3 = new SmartPhone(true, 256);
		
		samsungS3.modelo = "S3";
		samsungS3.fabricante = "Samsung";
		samsungS3.versionSO = 13;
		samsungS3.coste = 550;
		
		SmartWatch appleWatch = new SmartWatch(false, 45);
		
		appleWatch.modelo = "Series 8";
		appleWatch.fabricante = "Apple";
		appleWatch.versionSO = 8.7;
		appleWatch.coste = 600;
		
		System.out.println(motorolaG5.fabricante);
		System.out.println(motorolaG5.modelo);
		System.out.println(motorolaG5.versionSO);
		System.out.println(motorolaG5.coste);
		
		System.out.println();
		
		System.out.println(samsungS3.fabricante);
		System.out.println(samsungS3.modelo);
		System.out.println(samsungS3.versionSO);
		System.out.println(samsungS3.coste);
		System.out.println(samsungS3.eSim);
		System.out.println(samsungS3.modelo);
		System.out.println(samsungS3.versionSO);
		System.out.println(samsungS3.coste);
		
		System.out.println();
	
		System.out.println(appleWatch.fabricante);
		System.out.println(appleWatch.modelo);
		System.out.println(appleWatch.versionSO);
		System.out.println(appleWatch.coste);
		System.out.println(appleWatch.celular);
		System.out.println(appleWatch.tamaño);
		
		System.out.println();
		
		System.out.println("fin");
	
	}

	
}
