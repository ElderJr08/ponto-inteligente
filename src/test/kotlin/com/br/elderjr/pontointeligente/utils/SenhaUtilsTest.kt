package com.br.elderjr.pontointeligente.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtilsTest {
    private val SENHA = "123456"
    private val bCryptEnconder = BCryptPasswordEncoder()

    @Test
    fun testGerarHashSenha() {
        val hash = SenhaUtils().gerarBcrypt(SENHA)
        Assertions.assertTrue(bCryptEnconder.matches(SENHA, hash))
    }
}