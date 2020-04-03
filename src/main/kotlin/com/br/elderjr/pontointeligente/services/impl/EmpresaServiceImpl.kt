package com.br.elderjr.pontointeligente.services.impl

import com.br.elderjr.pontointeligente.documents.Empresa
import com.br.elderjr.pontointeligente.repositories.EmpresaRepository
import com.br.elderjr.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}