<p align="center">
  <img width="150" height="150" src="https://cdn2.thecatapi.com/images/mAGfq3LKj.png">
</p>

# <h1 align="center">__Gatitude__ 🐱</h1>
<p align="center"> Gatitude é um app que muda seu humor e atitude através de gifs divertidos de gatos.</p>

## Descrição 🐱
Este app foi feito para um teste da empresa Stefanini

## Technologias🖱️💾
* Kotlin
* Android Studio
* RX
* View Binding
* Retrofit
  * gson
  * okhttp3
* Glide
* Koin
* Viewmodel

## Arquitetura 🏛️🧩
MVVM

## To starting: 👨🏻‍💻🖥
### Instalação 👨🏻‍💻🖥️
- [x] É necessário baixar o Android Studio
- [x] É necessário ter acesso a API de gatos: https://thecatapi.com/

### Dependencias 🧩📄

```gradle
dependencies {

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1"
    implementation "androidx.recyclerview:recyclerview:1.2.1"
    implementation "androidx.cardview:cardview:1.0.0"
    implementation 'com.google.android.material:material:1.5.0'

    //Retrofit
    implementation 'com.squareup.retrofit2:converter-gson:2.6.1'
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.google.code.gson:gson:2.8.6'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.0'

    //koin injeção de dependência
    implementation 'org.koin:koin-android:2.0.1'
    implementation 'org.koin:koin-androidx-scope:2.0.1'
    implementation 'org.koin:koin-androidx-viewmodel:2.0.1'

    //RX
    implementation 'io.reactivex.rxjava2:rxjava:2.2.11'
    implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'
    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.9.0'

    //Download das imagens
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    androidTestAnnotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    implementation 'com.github.bumptech.glide:okhttp3-integration:4.4.0'

    //Test
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}
```

## Author 👨🏻‍💻🖥️
Darlei Silva <h5>https://br.linkedin.com/in/darlei-silva-937a93168<h5>
  
## Version History 💾
 1.0
