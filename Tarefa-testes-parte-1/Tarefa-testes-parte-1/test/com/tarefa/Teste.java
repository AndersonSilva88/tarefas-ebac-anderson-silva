package com.tarefa;

import org.junit.Assert;
import org.junit.Test;

public class Teste {

    @Test
    public void testeClasse() {
        Genero ge = new Genero();

        Assert.assertEquals("feminino", ge.getFeminino());
    }
}
