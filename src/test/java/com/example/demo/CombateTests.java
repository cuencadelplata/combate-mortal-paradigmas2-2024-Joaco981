package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CombateTests {
    
    @Test
    void todos_pueden_disparar_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();
        Buque b1 = new Buque();

        s1.disparar();
        t1.disparar();
        b1.disparar();

    }

    @Test
    void todos_pueden_recibir_un_disparo_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();
        Buque b1 = new Buque();
        
        s1.recibirDisparo();
        t1.recibirDisparo();
        b1.recibirDisparo();

        assert s1.getVida() == 0;
        assert t1.getVida() == 1;
        assert b1.getVida() == 2;

    }


    @Test
    void soldado_matar_tanque_con_2_tiros_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();

        s1.disparar();
        t1.recibirDisparo();
        s1.disparar();
        t1.recibirDisparo();
        
        assert t1.estaVivo() == false;  
    }

    @Test
    void soldado_matar_buque_con_3_tiros_test(){
        Soldado s1 = new Soldado();
        Buque b1 = new Buque();

        s1.disparar();
        b1.recibirDisparo();
        s1.disparar();
        b1.recibirDisparo();
        s1.disparar();
        b1.recibirDisparo();

        assert b1.getVida() == 0;
        assert b1.estaVivo() == false;

        
    }

    @Test
    void preguntar_si_esta_vivo_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();
        Buque b1 = new Buque();

        s1.estaVivo();
        t1.estaVivo();
        b1.estaVivo();

    }


    @Test
    void soldado_adquiere_escudo_test(){
        Soldado s1 = new Soldado();

        s1.setEscudo(50);
        s1.adquirirEscudo(s1.getEscudo());

        assert s1.getVida() == 1.5;
    }  

    @Test
    void soldado_dispara_a_tanque_con_50_por_ciento_de_escudo_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();

        t1.setEscudo(50);    
        s1.disparar();
        t1.recibirDisparoConEscudo();

        assert t1.getVida() == 1.5;


    }
  

}
