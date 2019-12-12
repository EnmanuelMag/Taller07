package emsamablajecarro.Builder;

import emsamablajecarro.creacional.Carro;

public class CarroDirector {
	
	private CarroBuilder builder;
	
	
	
	public void contruirCarro() {
		builder.DefinirCarro();
	}
	
	
	public Carro getCarro() {
		return builder.getCarro();
		
	}
	
	public CarroDirector(CarroBuilder cB) {
		
		builder = cB;
		
	}
}
