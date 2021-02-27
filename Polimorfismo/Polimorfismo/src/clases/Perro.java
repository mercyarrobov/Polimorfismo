package clases;

public class Perro extends Animal{
	/**
	   * @param nombre
	   */
	   public Perro(String nombre) {
	   super(nombre);
	   System.out.println("Constructor perro, nombre : "+nombre);
	 }

	 public void tipoAnimal() {
	  System.out.println("Tipo Animal : Es un Perro");
	 }
	 
	 public void comunicarse(){
	  System.out.println("Metodo comunicarse : El perro Ladra... Guau Guau");
	 } 

}
