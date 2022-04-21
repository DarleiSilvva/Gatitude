package vm.caatsoft.gatitude.data.remote.api

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import vm.caatsoft.gatitude.data.remote.response.InformacoesGatosResponse

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

interface CatApi {

    @GET("/v1/images/search")
    fun obterImagensRandomicas(@Query("limit") quantidade: Int,
                               @Query("mime_types") tipo: String
    ): Observable<List<InformacoesGatosResponse>>
}