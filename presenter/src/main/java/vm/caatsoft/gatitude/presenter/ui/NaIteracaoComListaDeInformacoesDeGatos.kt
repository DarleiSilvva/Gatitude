package vm.caatsoft.gatitude.presenter.ui

import android.widget.ImageView
import vm.caatsoft.domain.model.InformacoesGatos

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

interface NaIteracaoComListaDeInformacoesDeGatos {

    fun aoClicarNaImagem(informacoesGatos: InformacoesGatos)

    fun carregarImagem(url: String, imageView: ImageView)
}