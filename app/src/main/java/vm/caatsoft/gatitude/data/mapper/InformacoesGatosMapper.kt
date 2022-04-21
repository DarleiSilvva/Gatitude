package vm.caatsoft.gatitude.data.mapper

import vm.caatsoft.gatitude.data.remote.response.BreedResponse
import vm.caatsoft.gatitude.data.remote.response.CategoryResponse
import vm.caatsoft.gatitude.data.remote.response.InformacoesGatosResponse
import vm.caatsoft.gatitude.domain.model.Breed
import vm.caatsoft.gatitude.domain.model.Category
import vm.caatsoft.gatitude.domain.model.InformacoesGatos

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

fun InformacoesGatosResponse.toModel() = InformacoesGatos(
    id = id,
    url = url,
    category = category?.let { conversorListaCategory(it) },
    breed = breed?.let { conversorListaBreed(it) },
)


fun InformacoesGatos.toResponse() = InformacoesGatosResponse(
    id = id,
    url = url,
    category = category?.let { conversorListaCategoryResponse(it) },
    breed = breed?.let { conversorListaBreedResponse(it) },
)

fun conversorListaCategoryResponse (listCategory: List<Category>):List<CategoryResponse>{
    lateinit var lista: MutableList<CategoryResponse>
    listCategory.forEach {
        lista.add(it.toResponse())
    }
    return lista.toList()
}

fun conversorListaCategory (listCategory: List<CategoryResponse>):List<Category>{
    lateinit var lista: MutableList<Category>
    listCategory.forEach {
        lista.add(it.toModel())
    }
    return lista.toList()
}

fun conversorListaBreedResponse (listBreed: List<Breed>):List<BreedResponse>{
    lateinit var lista: MutableList<BreedResponse>
    listBreed.forEach {
        lista.add(it.toResponse())
    }
    return lista.toList()
}

fun conversorListaBreed (listBreed: List<BreedResponse>):List<Breed>{
    lateinit var lista: MutableList<Breed>
    listBreed.forEach {
        lista.add(it.toModel())
    }
    return lista.toList()
}