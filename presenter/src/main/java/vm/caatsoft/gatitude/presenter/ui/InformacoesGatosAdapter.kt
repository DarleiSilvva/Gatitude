package vm.caatsoft.gatitude.presenter.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vm.caatsoft.gatitude.databinding.CatCardViewBinding
import vm.caatsoft.domain.model.InformacoesGatos

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

class InformacoesGatosAdapter(
    private val listaInformacoesGatos: List<InformacoesGatos>,
    private val naIteracaoComListaDeInformacoesDeGatos: NaIteracaoComListaDeInformacoesDeGatos
) : RecyclerView.Adapter<InformacoesGatosAdapter.CatAdapterHolder>() {

    class CatAdapterHolder(val modelBinding: CatCardViewBinding) :
        RecyclerView.ViewHolder(modelBinding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CatAdapterHolder {
        return CatAdapterHolder(
            CatCardViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CatAdapterHolder, position: Int) {
        val informacaoGato = listaInformacoesGatos[position]

        holder.modelBinding.catTextView.text = if (informacaoGato.url.isNotEmpty()) {
            informacaoGato.url.replaceFirstChar { it.uppercase() }
        } else {
            SEM_CATEGORIA
        }
        naIteracaoComListaDeInformacoesDeGatos.carregarImagem(
            informacaoGato.url,
            holder.modelBinding.catImageView
        )

        holder.modelBinding.catImageView.setOnClickListener {
            naIteracaoComListaDeInformacoesDeGatos.aoClicarNaImagem(informacaoGato)
        }

    }

    override fun getItemCount(): Int {
        return listaInformacoesGatos.size
    }

    companion object {
        private const val SEM_CATEGORIA = "Não tem categoria"
    }

}