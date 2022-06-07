package com.example.movilcotizacion;

public class Cotizacion {
    private int numCotizacion;
    private String descripcionAuto;
    private double precio;
    private int porcentajeInicial;
    private int plazo;

    public Cotizacion(){

    }
    public Cotizacion(int numCotizacion, String descripcionAuto, double precio, int porcentajeInicial, int plazo){
        this.numCotizacion=numCotizacion;
        this.descripcionAuto=descripcionAuto;
        this.precio=precio;
        this.porcentajeInicial=porcentajeInicial;
        this.plazo=plazo;
    }
    public Cotizacion(Cotizacion cotizacion){
        System.out.println("Numero de cotizacion: "+this.numCotizacion);
        System.out.println("Descripcion del auto: "+this.descripcionAuto);
        System.out.println("Precio: "+this.precio);
        System.out.println("Porcentaje inicial: "+this.porcentajeInicial);
        System.out.println("Plazo: "+this.plazo);
    }

    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPorcentajeInicial() {
        return porcentajeInicial;
    }

    public void setPorcentajeInicial(int porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double calculoInicial(){
        return this.precio*this.porcentajeInicial/100;
    }
    public double totalFinanciar(){
        return this.precio-calculoInicial();
    }
    public double pagoMensual(){
        return totalFinanciar()/this.plazo;
    }

    @Override
    public String toString() {
        return "numCotizacion=" + numCotizacion +
                "\ndescripcionAuto='" + descripcionAuto + '\'' +
                "\nprecio=" + precio +
                "\nporcentajeInicial=" + porcentajeInicial +
                "\nplazo=" + plazo;
    }
}
