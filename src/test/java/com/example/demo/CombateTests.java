package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CombateTests {
    

    @Test
    void soldado_matar_tanque_con_2_tiros_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();

        t1.setVida(2);
        s1.setDisparar(2);
        t1.recibirDisparo(s1.getDisparar());

        assert t1.estaVivo() == false;

        
    }

    @Test
    void soldado_matar_buque_con_3_tiros_test(){
        Soldado s1 = new Soldado();
        Buque b1 = new Buque();

        b1.setVida(3);
        s1.setDisparar(3);
        b1.recibirDisparo(s1.getDisparar());

        assert b1.getVida() == 0;

        
    }


    @Test
    void soldado_dispara_a_tanque_con_50_por_ciento_de_escudo_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();

        t1.setVida(2);
        t1.setEscudo(50);
        
        s1.setDisparar(1);
        t1.recibirDisparoConEscudo(s1.getDisparar());

        assert t1.getVida() == 1.5;


    }

}
