package vm.caatsoft.data.mapper

import vm.caatsoft.data.remote.response.CategoryResponse
import vm.caatsoft.domain.model.Category

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

fun CategoryResponse.toModel() = Category(
    id = id,
    name = name
)

fun Category.toResponse() = CategoryResponse(
    id = id,
    name = name
)