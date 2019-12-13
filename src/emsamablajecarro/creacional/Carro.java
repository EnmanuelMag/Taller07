    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecarro.creacional;

/**
 *
 * @author Palacios
 */
public class Carro {

    private int almacenamiento;
    private String carroceria;
    private String marca;
    private String modelo;
    private float motor;
    private double precio;

    public Carro(int almacenamiento, String placa, String marca, String modelo, float motor,double precio) {
        this.almacenamiento = almacenamiento;
        this.carroceria = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Carro() {
    }
   

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getPlaca() {
        return carroceria;
    }

    public void setPlaca(String placa) {
        this.carroceria = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public float getMotor() {
        return motor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "{" + "almacenamiento=" + almacenamiento + ", carroceria=" + carroceria + ", marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
    
    
    
    
    
}
