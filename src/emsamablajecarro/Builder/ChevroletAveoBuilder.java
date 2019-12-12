package emsamablajecarro.Builder;

import emsamablajecarro.creacional.Carro;

public class ChevroletAveoBuilder extends CarroBuilder{
	

    @Override
    public void contruirMarcoModelo() {
        
        this.c.setMarca("Chevrolet");
        this.c.setModelo("Aveo");        
    }
    
    @Override
    public void definirAlmacenamiento() {
        this.c.setAlmacenamiento(1600);
        
    }
    
    @Override
    public void definirCarroreria() {
        this.c.setCarroceria("24FWJNE3");
        
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
        this.c.setMotor(1.8f);
    }

}
