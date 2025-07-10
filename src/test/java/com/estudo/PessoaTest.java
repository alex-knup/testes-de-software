package com.estudo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void deveCalcularIdade() {
        Pessoa alex = new Pessoa("Alex", LocalDate.of(2000, 7, 20));
        Assertions.assertEquals(24, alex.getIdade());
    }

    @Test
    void deveVerificarIdadeMaiorQue18(){
        Pessoa alex = new Pessoa("Alex", LocalDate.of(2000, 7, 20));
        Assertions.assertTrue(alex.ehMaiorDeIdade());
    }

    @Test
    void deveVerificarIdadeMenorQue18(){
        Pessoa alex = new Pessoa("Alex", LocalDate.of(2015, 7, 20));
        Assertions.assertFalse(alex.ehMaiorDeIdade());
    }
}