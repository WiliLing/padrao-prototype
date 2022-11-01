package org.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrachaTest {
    @Test
    void testClone() throws CloneNotSupportedException {

        Colaborador colaborador = new Colaborador(30019191, "Wil", "Analista de Sistemas");
        Cracha cracha = new Cracha(1, 1001, "Wil", colaborador);
        Cracha crachaClone = cracha.clone();

        crachaClone.setId(2);
        crachaClone.setAtribuicao(1002);

        Assertions.assertEquals("Cracha{id=1, atribuicao=1001, nome='Wil', colaborador=Colaborador{personNumber=30019191, nome='Wil, funcao='Analista de Sistemas'}}", cracha.toString());
        Assertions.assertEquals("Cracha{id=2, atribuicao=1002, nome='Wil', colaborador=Colaborador{personNumber=30019191, nome='Wil, funcao='Analista de Sistemas'}}", crachaClone.toString());
    }

}