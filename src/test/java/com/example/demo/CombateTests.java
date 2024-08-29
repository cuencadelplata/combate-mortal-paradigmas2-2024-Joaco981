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

        s1.disparar(t1);
        t1.disparar(s1);
        b1.disparar(b1);

    }

    @Test
    void todos_pueden_recibir_un_disparo_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();
        Buque b1 = new Buque();
        
        s1.disparar(t1);
        s1.disparar(b1);

        assert t1.getVida() == 1;
        assert b1.getVida() == 2;

    }


    @Test
    void soldado_matar_tanque_con_2_tiros_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();

        s1.disparar(t1);
        s1.disparar(t1);
        
        assert t1.estaVivo() == false;  
    }

    @Test
    void soldado_matar_buque_con_3_tiros_test(){
        Soldado s1 = new Soldado();
        Buque b1 = new Buque();

        s1.disparar(b1);
        s1.disparar(b1);
        s1.disparar(b1);

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

        assert s1.estaVivo() == true;
        assert t1.estaVivo() == true;
        assert b1.estaVivo() == true;


    }
    
    @Test
    void soldado_adquiere_escudo_test(){
        Soldado s1 = new Soldado();
        Escudo e1 = new Escudo();


        s1.adquirirEscudo(e1.getEscudo());

        assert s1.getVida() == 1.5;
    }  

    @Test
    void soldado_dispara_a_tanque_con_50_por_ciento_de_escudo_test(){
        Soldado s1 = new Soldado();
        Tanque t1 = new Tanque();
        Escudo e1 = new Escudo();


        t1.adquirirEscudo(e1.getEscudo());    
        s1.disparar(t1);

        assert t1.getVida() == 1.5;
    }

    @Test
    void chucknorris_es_inmortal_test(){
        ChuckNorris ch = new ChuckNorris();
        Tanque t1 = new Tanque();
        Soldado s1 = new Soldado();
        Buque b1 = new Buque();

        s1.disparar(ch);
        b1.disparar(ch);
        t1.disparar(ch);

        assert ch.estaVivo() == true;
    }
  

}
