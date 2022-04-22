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
    ext{
        versions = [
                compileSdk  : 31,
                minSdk      : 21,
                targetSdk   : 31,
                versionCode : 1,
                versionName : '1.0',
                java        : 1.8,
                jvmTarget   :'1.8',

                android    : [
                        core             : '1.7.0',
                        appcompat        :'1.4.1',
                        material         :'1.5.0',
                        constraintLayout :'2.1.3',
                        viewModel        :'2.4.1',
                        recyclerview     :'1.2.1',
                        cardview         :'1.0.0'
                ],

                retrofit : [
                        geral         :'2.9.0',
                        converterGson :'2.6.1',
                        rxJavaAdapter :'2.9.0',
                        okhttp3       :'4.9.0'
                ],

                koin : '2.0.1',

                rx       : [
                        android       :'2.0.2',
                        rxAdapter    :'2.1.1'
                ],

                glide    : [
                        geral         :'4.12.0',
                        integration   : '4.4.0'
                ],

                tests : [
                        junit        : '4.13.2',
                        extJunit     : '1.1.3',
                        espresso     : '3.4.0',
                        mockito      : '2.24.5',
                        mockitoKotlin: '2.0.0',
                        mockwebserver: '3.11.0'
                ]
        ]

        android = [
                androidx    : [
                        core: "androidx.core:core-ktx:${versions.android.core}",
                        appcompat: "androidx.appcompat:appcompat:${versions.android.appcompat}",
                        material: "com.google.android.material:material:${versions.android.material}",
                        constraintLayout: "androidx.constraintlayout:constraintlayout:${versions.android.constraintLayout}",
                        recyclerview: "androidx.recyclerview:recyclerview:${versions.android.recyclerview}",
                        cardview: "androidx.cardview:cardview:${versions.android.cardview}"
                ],
                viewModel: "androidx.lifecycle:lifecycle-viewmodel-ktx:${versions.android.viewModel}"
        ]

        retrofit   =        [
                geral      : "com.squareup.retrofit2:retrofit:${versions.retrofit.geral}",
                converterGson: "com.squareup.retrofit2:converter-gson:${versions.retrofit.converterGson}",
                rxJavaAdapter: "com.squareup.retrofit2:adapter-rxjava2:${versions.retrofit.rxJavaAdapter}",
                okhttp3      : "com.squareup.okhttp3:logging-interceptor:${versions.retrofit.okhttp3}"
        ]

        koin  =        [
                android         : "org.koin:koin-android:${versions.koin}",
                scope           : "org.koin:koin-androidx-scope:${versions.koin}",
                viewmodel       : "org.koin:koin-androidx-viewmodel:${versions.koin}"
        ]

        rx =             [
                android: "io.reactivex.rxjava2:rxandroid:${versions.rx.android}",
                rxAdapter: "io.reactivex.rxjava2:rxjava:${versions.rx.rxAdapter}"
        ]

        glide = [
                principal : "com.github.bumptech.glide:glide:${versions.glide.geral}",
                compiler  : "com.github.bumptech.glide:compiler:${versions.glide.geral}",
                integration: "com.github.bumptech.glide:okhttp3-integration:${versions.glide.integration}"
        ]

        tests  =         [
                junit: "junit:junit:${versions.tests.junit}",
                extJunit: "androidx.test.ext:junit:${versions.tests.extJunit}",
                espresso: "androidx.test.espresso:espresso-core:${versions.tests.espresso}",
                mockito       : "org.mockito:mockito-core:${versions.tests.mockito}",
                mockitoAndroid: "org.mockito:mockito-android:${versions.tests.mockito}",
                mockitoKotlin : "com.nhaarman.mockitokotlin2:mockito-kotlin:${versions.tests.mockitoKotlin}",
                mockwebserver : "com.squareup.okhttp3:mockwebserver${versions.tests.mockwebserver}"
        ]

    }
```

## Author 👨🏻‍💻🖥️
Darlei Silva <h5>https://br.linkedin.com/in/darlei-silva-937a93168<h5>
  
## Version History 💾
 1.0
