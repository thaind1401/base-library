plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.android.devtools.ksp)
}

android {
    namespace = "com.thaind.baseapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.thaind.baseapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            manifestPlaceholders["crashlyticsCollectionEnabled"] = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            manifestPlaceholders["crashlyticsCollectionEnabled"] = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    implementation(libs.score.calculator)
    implementation(libs.ads)
    //implementation(project(":score"))
    // Kotlin
    implementation(libs.kotlin.stdlib)

    // Coroutines
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    // Android
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.activity.ktx)

    // Architecture Components
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Room components
    implementation(libs.room.ktx)
    implementation(libs.room.runtime.ktx)
    ksp(libs.room.compiler)

    // Material Design
    implementation(libs.material)
    //implementation(libs.material.dialog)

    // Coil-kt
    implementation(libs.coil)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.moshi)
    implementation(libs.logging.interceptor)

    // Moshi
    implementation(libs.moshi.kotlin)
    implementation(libs.moshi.kotlin.codegen)
    ksp(libs.moshi.kotlin.codegen)

    // Hilt + Dagger
    implementation(libs.hilt.android)
    implementation(libs.hilt.lifecycle.viewmodel)
    ksp(libs.moshi.hilt.android.compiler)
    ksp(libs.hilt.compiler)

    // Timber
    implementation(libs.timber)

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}