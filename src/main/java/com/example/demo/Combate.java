package com.example.demo;

public class Combate {
    private int disparar;
    private double vida;
    private int escudo;
    private double daño;

    public double getVida() {
        return vida;
    }

    public void setVida(double valor) {
        vida = valor;
    }

    public int getDisparar() {
        return disparar;
    }

    public void setDisparar(int valor) {
        disparar = valor;
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


    public void recibirDisparo(int disparar) {
        double vida = getVida();
        vida -= disparar;
        setVida(vida);
    }

    public void recibirDisparoConEscudo(int disparar){
        double vida = getVida();
        double escudo = getEscudo();
        vida -= disparar - (escudo / 100);
        setVida(vida);

    }

    public void armarEscudo(int escudo) {
        
    }

    public boolean estaVivo(){
        return vida > 0;
    }



}
