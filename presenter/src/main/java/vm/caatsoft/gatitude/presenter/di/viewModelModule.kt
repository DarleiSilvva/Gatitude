package vm.caatsoft.gatitude.presenter.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import vm.caatsoft.gatitude.presenter.ui.viewmodel.MainViewModel

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

val viewModelModule = module {
    viewModel {
        MainViewModel(caRepository = get())
    }
}