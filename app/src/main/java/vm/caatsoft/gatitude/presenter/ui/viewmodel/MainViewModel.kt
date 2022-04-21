package vm.caatsoft.gatitude.presenter.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import vm.caatsoft.gatitude.domain.CatRepository
import vm.caatsoft.gatitude.domain.model.InformacoesGatos

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

class MainViewModel(var caRepository: CatRepository) : ViewModel() {
    private var mInformacoesGatos = MutableLiveData<List<InformacoesGatos>>()
    private val _isLoading = MutableLiveData(LOADING)
    val isLoading: LiveData<Boolean> = _isLoading
    private val _isErro = MutableLiveData(VAZIO)
    val isErro: LiveData<String> = _isErro

    fun obterImagensRandomicasDosGatos(): MutableLiveData<List<InformacoesGatos>> {
        try {
            mInformacoesGatos = caRepository.obterInformacoesDeGatos(QUANTIDADE_DE_CARDS, TIPO)
        } catch (e: Exception) {
            e.printStackTrace()
            _isErro.value = e.toString()
        } finally {
            _isLoading.value = PAROU
        }
        return mInformacoesGatos
    }

    companion object {
        private const val QUANTIDADE_DE_CARDS = 20
        private const val TIPO = "gif"
        private const val PAROU = false
        private const val LOADING = true
        private const val VAZIO = ""
    }
}

