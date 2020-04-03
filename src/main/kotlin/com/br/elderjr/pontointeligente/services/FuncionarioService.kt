package com.br.elderjr.pontointeligente.services

import com.br.elderjr.pontointeligente.documents.Funcionario

interface FuncionarioService {
    fun persistir(funcionario: Funcionario): Funcionario
    fun buscarPorCpf(cpf: String): Funcionario?
    fun buscarPorEmail(email: String) :Funcionario?
    fun buscarPorId(id: String): Funcionario?
}