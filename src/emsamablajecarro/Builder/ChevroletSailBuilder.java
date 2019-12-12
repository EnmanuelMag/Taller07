package emsamablajecarro.Builder;

import emsamablajecarro.creacional.Carro;

public class ChevroletSailBuilder extends CarroBuilder{
	

    @Override
    public void contruirMarcoModelo() {
        
        this.c.setMarca("Chevrolet");
        this.c.setModelo("Sail");        
    }
    
    @Override
    public void definirAlmacenamiento() {
        this.c.setAlmacenamiento(1000);
        
    }
    
    @Override
    public void definirCarroreria() {
        this.c.setCarroceria("1J23KO23");
        
    }
    
    @Override
    public Carro getCarro() {
        return c;
        
    }
    
    @Override
    public void DefinirCarro() {
        
        this.c = new Carro();
        contruirMarcoModelo();
        definirCarroreria();
        definirAlmacenamiento();
        definirMotor();
    }
    
    @Override
    public void definirMotor() {
        this.c.setMotor(1.4f);
    }

}
