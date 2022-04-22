package vm.caatsoft.domain.model

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

data class InformacoesGatos(
    val id: String = "",
    val url: String = "",
    val category: List<Category>? = null,
    val breed: List<Breed>? = null
)
