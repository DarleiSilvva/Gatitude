package vm.caatsoft.data.mapper

import vm.caatsoft.data.remote.response.BreedResponse
import vm.caatsoft.domain.model.Breed

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

fun BreedResponse.toModel() = Breed(
    id = id,
    name = id,
    lifespan = lifespan,
    origin = origin,
    wikipediaUrl = wikipediaUrl
)


fun Breed.toResponse() = BreedResponse(
    id = id,
    name = id,
    lifespan = lifespan,
    origin = origin,
    wikipediaUrl = wikipediaUrl
)
