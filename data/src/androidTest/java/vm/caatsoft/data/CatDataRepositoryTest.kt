package vm.caatsoft.data

import androidx.lifecycle.MutableLiveData
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import okhttp3.internal.tls.OkHostnameVerifier.verify
import org.junit.Assert
import com.nhaarman.mockitokotlin2.*

import org.junit.Test
import org.junit.runner.RunWith
import com.nhaarman.mockitokotlin2.*

import org.junit.Assert.*
import vm.caatsoft.data.mapper.toModel
import vm.caatsoft.data.remote.api.CatApi
import vm.caatsoft.domain.model.InformacoesGatos

@RunWith(AndroidJUnit4::class)
class CatDataRepositoryTest {

    private val catApi = mock<CatApi>()
    val listInformacoesGatos: MutableLiveData<List<InformacoesGatos>> = MutableLiveData()

    @Test
    fun listaCarregada ()  {
        val resultados: MutableList<InformacoesGatos> = ArrayList()

        val observable = catApi.obterImagensRandomicas(5, "gif")

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
                    }
                }, {
                    it.printStackTrace()
                })
        )
        listInformacoesGatos.apply {
            value?.let { assert(it.isNotEmpty()) }
        }
    }
}