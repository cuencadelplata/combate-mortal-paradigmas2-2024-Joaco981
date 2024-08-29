package com.example.demo;


public class Combate {
    private double vida;
    private double escudo;
    private double danio;
    private Combate e1;

    public double getVida() {
        return vida;
    }

    public void setVida(double valor) {
        vida = valor;
    }

    public void disparar(Combate objetivo) {
        objetivo.recibirDisparo(danio);
    }

    public double getDaño() {
        return danio;
    }

    public void setDaño(double valor) {
        danio = valor;
    }

    public void recibirDisparo(double danio) {
        double danioActual = danio;
        
        if(escudo > 0){
            danioActual = danioActual * (1 - getEscudo() / 100);
            setVida(getVida() - danioActual);
        } else{
            setVida(getVida()-1);  
        }
        
    }

    public double getEscudo() {
        return escudo;
    }

    public void setEscudo(double valor) {
        escudo = valor;
    }


    public void adquirirEscudo(double escudo) {
        setVida(getVida() + (escudo / 100));
    }

    public boolean estaVivo(){
        return vida > 0;
    }

}
