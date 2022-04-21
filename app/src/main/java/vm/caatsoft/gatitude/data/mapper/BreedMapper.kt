package vm.caatsoft.gatitude.data.mapper

import vm.caatsoft.gatitude.data.remote.response.BreedResponse
import vm.caatsoft.gatitude.domain.model.Breed

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
