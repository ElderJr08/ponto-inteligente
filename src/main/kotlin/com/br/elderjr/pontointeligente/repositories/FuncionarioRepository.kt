package com.br.elderjr.pontointeligente.repositories

import com.br.elderjr.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {
    fun findByEmail(email: String): Funcionario
    fun findByCpf(cpf: String): Funcionario
    fun findOne(id: String): Funcionario
}