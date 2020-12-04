
package com.linc.buildSrc

object Versions {
    const val appcompat = "1.1.0"
    const val kotlin_version = "1.3.72"
    const val material = "1.1.0"
    const val core_ktx = "1.2.0"
    const val constraintlayout = "1.1.3"
    const val junit = "4.+"
    const val ext_junit = "1.1.1"
    const val espresso_core = "3.2.0"
    const val koin_version = "2.0.1"
    const val hit = "2.28-alpha"
    const val hitViewModule = "1.0.0-alpha01"
    const val retrofit = "2.9.0"
    const val okhttpLogging = "4.8.0"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val junit = "junit:junit:${Versions.junit}"
    const val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}

object Kotlin{
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
}

object Koin {
    const val koin = "org.koin:koin-android:${Versions.koin_version}"
    const val viewmodel = "org.koin:koin-android-viewmodel:${Versions.koin_version}"
}

object Hilt {
    const val daggerRuntime = "com.google.dagger:hilt-android:${Versions.hit}"
    const val daggerCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hit}"
    const val viewModule = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hitViewModule}"
    const val compiler = "androidx.hilt:hilt-compiler:${Versions.hitViewModule}"
}


object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
}