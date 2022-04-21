package vm.caatsoft.gatitude.presenter

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import vm.caatsoft.gatitude.presenter.di.networkModule
import vm.caatsoft.gatitude.presenter.di.viewModelModule

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

class App : Application() {
  override fun onCreate() {
    super.onCreate()
    startKoin {
      androidLogger()
      androidContext(this@App)
      modules(listOf(networkModule, viewModelModule))
    }
  }
}