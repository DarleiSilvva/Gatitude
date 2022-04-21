package vm.caatsoft.gatitude.data.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

data class CategoryResponse (
    @SerializedName("id") val id:Int = 0,
    @SerializedName("name") var name:String = ""
)
