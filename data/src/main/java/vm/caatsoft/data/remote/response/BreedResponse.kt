package vm.caatsoft.data.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

data class BreedResponse(
    @SerializedName("id") val id: String = "",
    @SerializedName("name") val name: String = "",
    @SerializedName("lifespan") val lifespan: String = "",
    @SerializedName("origin") val origin: String = "",
    @SerializedName("wikipediaUrl") val wikipediaUrl: String = ""
)
