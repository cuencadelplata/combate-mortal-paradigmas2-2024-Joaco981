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

    public int disparar() {
        return 1;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int valor) {
        escudo = valor;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double valor) {
        daño = valor;
    }


    public void recibirDisparo() {
        double vida = getVida();
        vida -= 1; 
        setVida(vida);
    }

    public void recibirDisparoConEscudo(){
        double vida = getVida();
        double escudo = getEscudo();
        vida -= 1 - (escudo / 100);
        setVida(vida);

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
