package poo.interfaces;

public class Main {
	
	static CocheCRUD cocheCRUD;
	
	public static void main(String[] args) {
		
		CocheCRUD cocheCrud = new CocheCRUDImpl();
		
		cocheCrud.save();
		cocheCrud.findAll();
		cocheCrud.delete();
		
		
	}
	
}
