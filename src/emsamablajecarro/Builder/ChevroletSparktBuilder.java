package emsamablajecarro.Builder;

import emsamablajecarro.creacional.Carro;

public class ChevroletSparktBuilder extends CarroBuilder{
	

    @Override
    public void contruirMarcoModelo() {

        this.c.setMarca("Chevrolet");
        this.c.setModelo("Sparkt");
    }

    @Override
    public void definirAlmacenamiento() {
        this.c.setAlmacenamiento(500);

    }

    @Override
    public void definirCarroreria() {
        this.c.setCarroceria("JWE9EWF8");

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
        this.c.setMotor(1.2f);
    }
}
