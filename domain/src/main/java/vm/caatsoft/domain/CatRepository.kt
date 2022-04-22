package vm.caatsoft.domain

import androidx.lifecycle.MutableLiveData
import vm.caatsoft.domain.model.InformacoesGatos

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

interface CatRepository {

    fun obterInformacoesDeGatos(
        quantidade: Int,
        tipo: String
    ): MutableLiveData<List<InformacoesGatos>>
}