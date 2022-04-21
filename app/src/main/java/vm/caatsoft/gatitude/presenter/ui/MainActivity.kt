package vm.caatsoft.gatitude.presenter.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import org.koin.androidx.viewmodel.ext.android.viewModel
import vm.caatsoft.gatitude.R
import vm.caatsoft.gatitude.databinding.ActivityMainBinding
import vm.caatsoft.gatitude.domain.model.InformacoesGatos
import vm.caatsoft.gatitude.presenter.ui.viewmodel.MainViewModel

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

class MainActivity : AppCompatActivity(), NaIteracaoComListaDeInformacoesDeGatos {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel()
    private lateinit var informacoesGatosAdapter: InformacoesGatosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listarInformacoesDosGatos()
    }

    private fun listarInformacoesDosGatos() {

        viewModel.isLoading.observe(this,
            { isLoading ->
                isLoading?.let {
                    if (it){
                        binding.semConexaoConstraint.visibility = View.GONE
                        binding.loadingImageView.visibility = View.VISIBLE
                    } else {
                        binding.semConexaoConstraint.visibility = View.GONE
                        binding.loadingImageView.visibility = View.GONE
                    }
                }
            })

        viewModel.obterImagensRandomicasDosGatos().observe(this, { listaInformacoesGatos ->
            val layoutManager: GridLayoutManager = GridLayoutManager(this, 2)
            informacoesGatosAdapter = InformacoesGatosAdapter(
                listaInformacoesGatos = listaInformacoesGatos,
                naIteracaoComListaDeInformacoesDeGatos = this
            )
            binding.recyclerView.layoutManager = layoutManager
            binding.recyclerView.adapter = informacoesGatosAdapter
        })

        viewModel.isErro.observe(this,
            { isErro ->
                isErro?.let {
                    if (it != VAZIO){
                        Log.e("ErroNaRequisicao", it)
                        binding.loadingImageView.visibility = View.GONE
                        binding.semConexaoConstraint.visibility = View.VISIBLE
                    }
                }
            })

    }

    override fun aoClicarNaImagem(informacoesGatos: InformacoesGatos) {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "url da imagem ${informacoesGatos.url}")
        shareIntent.putExtra(Intent.EXTRA_TEXT, informacoesGatos.url)
        startActivity(Intent.createChooser(shareIntent, "imagem do id ${informacoesGatos.id}"))
    }

    override fun carregarImagem(url: String, imageView: ImageView) {

        val loading = R.drawable.loading
        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .placeholder(loading)
            .error(loading)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .priority(Priority.HIGH)
            .dontAnimate()
            .dontTransform()

        Glide.with(this)
            .load(url)
            .apply(options)
            .into(imageView)
    }

    companion object {
        private const val VAZIO = ""
    }
}