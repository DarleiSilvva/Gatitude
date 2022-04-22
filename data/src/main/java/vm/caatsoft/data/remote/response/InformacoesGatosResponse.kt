package vm.caatsoft.data.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

data class InformacoesGatosResponse(
    @SerializedName("id") val id: String = "",
    @SerializedName("url") var url: String = "",
    @SerializedName("category") var category: List<CategoryResponse>? = null,
    @SerializedName("breed") var breed: List<BreedResponse>? = null
)
