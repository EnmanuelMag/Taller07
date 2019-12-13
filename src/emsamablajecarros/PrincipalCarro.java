/**
 * 
 */
package emsamablajecarros;

import emsamablajecarro.creacional.Carro;
import emsamablajecarro.Builder.ChevroletSailBuilder;
import emsamablajecarro.Builder.CarroDirector;
import emsamablajecarro.Builder.ChevroletAveoBuilder;
import emsamablajecarro.Builder.ChevroletSparktBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author djurado
 *
 */
public class PrincipalCarro {

	/**
	 * @param args
	 */
    
    
        static ArrayList<Carro> carrosEnsamblados = new ArrayList<>();

        static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
            
            PrincipalCarro main = new PrincipalCarro();
            main.menu();
	/*	
		
		
		
		//Mostrar las caracteristicas de ambas computadoras 
		System.out.println(sparkt);
		System.out.println(sail);
                System.out.println(aveo);
                */

	}
        
    public void menu(){
        llenarCarrosIniciales();
        String opcion="";
        while(!opcion.equals("3")){
              System.out.println("╔              Menu             ╗");
              System.out.println("║ 1. Ensamblaje                 ║");
              System.out.println("║ 2. Venta                      ║");             
              System.out.println("║ 3. Salir                      ║");        
              System.out.println("╚                               ╝");
              System.out.print("Ingrese opcion: ");      
              opcion = sc.nextLine();
            switch (opcion){
                case "1":
                    ensamblaje();
                    break;
                case "2":
                    
                    //carrosEnsamblados.forEach((carro) -> System.out.println(carro));
                     mostrarCarrosDisponibles();
                    break;
                case "3":
                    System.out.println("gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion No valida!!");
            }
        }
        sc.close();
    }
    //
    public void ensamblaje(){
        String opcionE="";
        while(!opcionE.equals("4")){
              System.out.println("╔          Opciones             ╗");
              System.out.println("║ 1. Chevrolet Sail             ║");
              System.out.println("║ 2. Chevrolet Spark            ║");             
              System.out.println("║ 3. Chevrolet Aveo             ║");  
              System.out.println("║ 4. Volver al menu principal   ║");        
              System.out.println("╚                               ╝");
              System.out.print("Ingrese opcion: ");      
              opcionE = sc.nextLine();
            switch (opcionE){
                case "1":
                    CarroDirector cD = new CarroDirector(new ChevroletSailBuilder());
                    cD.contruirCarro();
                    Carro sail = cD.getCarro();
                    carrosEnsamblados.add(sail); 
                    break;
                case "2":
                    CarroDirector cD2 = new CarroDirector(new ChevroletSparktBuilder());
                    cD2.contruirCarro();
                    Carro sparkt = cD2.getCarro();
                    carrosEnsamblados.add(sparkt); 

                    break;
                case "3":
                    CarroDirector cD3 = new CarroDirector(new ChevroletAveoBuilder());
                    cD3.contruirCarro();
                    Carro aveo = cD3.getCarro();
                    carrosEnsamblados.add(aveo);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Opcion No valida!!");
            }
        }
       
        
    
    }
    //
  
    //
    public void mostrarCarrosDisponibles(){
        
        String opcionE="";
        while(!opcionE.equals("4")){
            
            int stockSail = 0;
            int stockAveo = 0;
            int stockSpark = 0;

            for (Carro car : carrosEnsamblados) {
                if(car.getModelo().equals("Aveo")){
                    stockAveo++;
                }
                else if(car.getModelo().equals("Sail")){
                    stockSail++;
                }
                else{
                    stockSpark++;
                }
            }
              System.out.println("╔          Carros Disponibles     ╗");
              System.out.println("║ 1. Chevrolet Sail  Stock: "+stockSail+"     ║");
              System.out.println("║ 2. Chevrolet Spark Stock: "+stockSpark+"     ║");            
              System.out.println("║ 3. Chevrolet Aveo  Stock: "+stockAveo+"     ║");
              System.out.println("║ 4. Volver al menu principal     ║");        
              System.out.println("╚                                 ╝");
              System.out.print("Ingrese opcion: ");      
              opcionE = sc.nextLine();
               switch (opcionE){
                case "1":
                    System.out.println(carrosEnsamblados.get(0));
                    break;
                case "2":
                    System.out.println(carrosEnsamblados.get(2));
                    break;
                case "3":
                    System.out.println(carrosEnsamblados.get(3));
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Opcion No valida!!");
            }
        }
    }
    //
    public void llenarCarrosIniciales(){
        CarroDirector cD = new CarroDirector(new ChevroletSailBuilder());
        cD.contruirCarro();
        Carro sail = cD.getCarro();
        Carro sail2 = cD.getCarro();
        carrosEnsamblados.add(sail); 
        carrosEnsamblados.add(sail2); 


        CarroDirector cD2 = new CarroDirector(new ChevroletSparktBuilder());
        cD2.contruirCarro();
        Carro sparkt = cD2.getCarro();
        carrosEnsamblados.add(sparkt); 


        CarroDirector cD3 = new CarroDirector(new ChevroletAveoBuilder());
        cD3.contruirCarro();
        Carro aveo = cD3.getCarro();
        carrosEnsamblados.add(aveo);
    }
    
    

}
