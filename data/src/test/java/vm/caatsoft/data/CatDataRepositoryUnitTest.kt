package vm.caatsoft.data

import androidx.lifecycle.MutableLiveData
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.junit.Assert
import org.junit.Test
import vm.caatsoft.data.mapper.toModel
import vm.caatsoft.data.remote.api.CatApi
import vm.caatsoft.domain.model.InformacoesGatos

class CatDataRepositoryUnitTest {

    private val catApi = mock<CatApi>()

    @Test
    fun `a lista deve estar carregada`()  {
        verify(catApi).obterImagensRandomicas(5, "gif")
    }
}