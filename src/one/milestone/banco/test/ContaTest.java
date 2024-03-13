package one.milestone.banco.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import one.milestone.banco.model.Conta;

public class ContaTest {
    Conta conta;

    @BeforeEach
    void setUp() {
        conta = new Conta("12345", 1000.0f, "01/01/2021", true);
    }

    @Test
    void sacarQuantiaValida() {
        conta.sacar(500.0f);
        assertEquals(500.0f, conta.getSaldo());
    }

    @Test
    void depositarQuantiaValida() {
        conta.depositar(500.0f);
        assertEquals(1500.0f, conta.getSaldo());
    }

    @Test
    void transferirQuantiaValida() {
        Conta contaDestino = new Conta("67890", 500.0f, "02/02/2021", true);
        conta.transferir(contaDestino, 500.0f);
        assertEquals(500.0f, conta.getSaldo());
        assertEquals(1000.0f, contaDestino.getSaldo());
    }

    @Test
    void sacarQuantiaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(2000.0f);
        });
    }

    @Test
    void depositarQuantiaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(-500.0f);
        });
    }

    @Test
    void transferirComSaldoInsuficiente() {
        Conta contaDestino = new Conta("67890", 500.0f, "02/02/2021", true);
        assertThrows(IllegalArgumentException.class, () -> {
            conta.transferir(contaDestino, 2000.0f);
        });
    }
}
