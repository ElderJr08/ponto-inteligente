package com.br.elderjr.pontointeligente.services.impl

import com.br.elderjr.pontointeligente.documents.Funcionario
import com.br.elderjr.pontointeligente.repositories.FuncionarioRepository
import com.br.elderjr.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {
    override fun persistir(funcionario: Funcionario): Funcionario = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findOne(id)
}