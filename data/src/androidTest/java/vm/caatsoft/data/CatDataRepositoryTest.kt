package vm.caatsoft.data

import androidx.test.ext.junit.runners.AndroidJUnit4
import io.reactivex.Observable
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import retrofit2.adapter.rxjava2.HttpException
import vm.caatsoft.data.remote.api.CatApi
import vm.caatsoft.data.remote.response.InformacoesGatosResponse

@RunWith(AndroidJUnit4::class)
class CatDataRepositoryTest {

    lateinit var catDataRepository: CatDataRepository
    lateinit var catApi: CatApi
    lateinit var listaInformacoesGatosResponse: List<InformacoesGatosResponse>
    var code = 0

    @Before
    @Throws
    fun setup() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler({ Schedulers.trampoline() })
        MockitoAnnotations.initMocks(this)

        catApi = mock(CatApi::class.java)

        catDataRepository = CatDataRepository(catApi)

    }

    @Test
    fun verificarCodigoErro()  {
        val call: Observable<List<InformacoesGatosResponse>> = catApi.obterImagensRandomicas(10, "gif")

        call.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableObserver<List<InformacoesGatosResponse>>()
            {
                public override fun onStart() {
                    TODO("Not yet implemented")
                }

                override fun onError(t: Throwable) {
                    t.printStackTrace()
                    if (t is HttpException) {
                        val response: HttpException = t as HttpException
                        code = response.code()
                    }
                }

                override fun onComplete() {
                    TODO("Not yet implemented")
                }

                override fun onNext(t: List<InformacoesGatosResponse>) {
                    TODO("Not yet implemented")
                }
            })

        assert(code == 0)
    }

    @Test
    fun verificarLista()  {
        val call: Observable<List<InformacoesGatosResponse>> = catApi.obterImagensRandomicas(10, "gif")

        call.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableObserver<List<InformacoesGatosResponse>>()
            {
                public override fun onStart() {
                    TODO("Not yet implemented")
                }

                override fun onError(t: Throwable) {
                    t.printStackTrace()
                    if (t is HttpException) {
                        val response: HttpException = t as HttpException
                        code = response.code()
                    }
                }

                override fun onComplete() {
                    TODO("Not yet implemented")
                }

                override fun onNext(t: List<InformacoesGatosResponse>) {
                    TODO("Not yet implemented")
                }
            })

        assert(listaInformacoesGatosResponse.isEmpty())
    }
}