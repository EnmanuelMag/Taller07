package emsamablajecarro.Builder;

import emsamablajecarro.creacional.Carro;

public abstract class CarroBuilder {
	
	
	protected Carro c;
	
	public abstract void contruirMarcoModelo();
	
	public abstract void definirAlmacenamiento();
	
	public abstract void definirCarroreria();
	
	public abstract void DefinirCarro();
	
	public abstract Carro getCarro();
        
        public abstract void definirMotor();
        
}
