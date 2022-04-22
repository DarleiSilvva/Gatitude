package vm.caatsoft.data

import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import vm.caatsoft.data.mapper.toModel
import vm.caatsoft.data.remote.api.CatApi
import vm.caatsoft.domain.CatRepository
import vm.caatsoft.domain.model.InformacoesGatos

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

class CatDataRepository(
    private val catApi: CatApi
) : CatRepository {

    val listInformacoesGatos: MutableLiveData<List<InformacoesGatos>> = MutableLiveData()

    override fun obterInformacoesDeGatos(
        quantidade: Int,
        tipo: String
    ): MutableLiveData<List<InformacoesGatos>> {

        val resultados: MutableList<InformacoesGatos> = ArrayList()

        val observable = catApi.obterImagensRandomicas(quantidade, tipo)

        CompositeDisposable().add(
            observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ lista ->
                    lista?.let {
                        lista.forEach {
                            resultados.add(
                                it.toModel()
                            )
                        }
                        listInformacoesGatos.postValue(resultados)
                    }
                }, {
                    it.printStackTrace()
                })
        )

        return listInformacoesGatos
    }

}



