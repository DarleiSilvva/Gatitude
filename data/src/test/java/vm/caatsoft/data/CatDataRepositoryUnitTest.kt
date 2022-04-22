package vm.caatsoft.data

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test
import vm.caatsoft.data.remote.api.CatApi

class CatDataRepositoryUnitTest {

    private val catApi = mock<CatApi>()

    @Test
    fun `a lista deve estar carregada`()  {
        verify(catApi).obterImagensRandomicas(5, "gif")
    }
}