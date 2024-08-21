package com.example.demo;


public class Combate {
    private double vida;
    private int escudo;
    private double daño;

    public double getVida() {
        return vida;
    }

    public void setVida(double valor) {
        vida = valor;
    }

    public void disparar(Combate objetivo) {
        objetivo.recibirDisparo();
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double valor) {
        daño = valor;
    }


    public void recibirDisparo() {
        var danio = 1;

        if(getEscudo() != null){
            danio = danio - e1.getEscudo();
        }
        
        setVida(getVida()-1);
    }


    public void adquirirEscudo(double escudo) {
        double vida = getVida();
        vida += escudo / 100;
        setVida(vida);
    }

    public boolean estaVivo(){
        return vida > 0;
    }

}
