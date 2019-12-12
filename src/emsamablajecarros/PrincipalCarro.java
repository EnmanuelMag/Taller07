/**
 * 
 */
package emsamablajecarros;

import emsamablajecarro.creacional.Carro;
import emsamablajecarro.Builder.ChevroletSailBuilder;
import emsamablajecarro.Builder.CarroDirector;
import emsamablajecarro.Builder.ChevroletAveoBuilder;
import emsamablajecarro.Builder.ChevroletSparktBuilder;

/**
 * @author djurado
 *
 */
public class PrincipalCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		CarroDirector cD = new CarroDirector(new ChevroletSailBuilder());
		cD.contruirCarro();
		Carro sail = cD.getCarro();
		
		CarroDirector cD2 = new CarroDirector(new ChevroletSparktBuilder());
		cD2.contruirCarro();
		Carro sparkt = cD2.getCarro();
                
                CarroDirector cD3 = new CarroDirector(new ChevroletAveoBuilder());
		cD3.contruirCarro();
		Carro aveo = cD3.getCarro();
		
		//Mostrar las caracteristicas de ambas computadoras 
		System.out.println(sparkt);
		System.out.println(sail);
                System.out.println(aveo);
		

	}

}
