plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.jawadahmadkhan.i220791"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jawadahmadkhan.i220791"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.junit.junit)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)

    // Test dependencies
    testImplementation(libs.junit)
    testImplementation(libs.junit) // For unit tests
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit.v115) // For Android instrumentation tests
    androidTestImplementation(libs.androidx.espresso.core.v351) // Espresso for UI tests
    androidTestImplementation(libs.androidx.runner) // Test runner
    androidTestImplementation(libs.androidx.rules) // Test rules

    // Firebase and Google Auth
//    implementation(platform("com.google.firebase:firebase-bom:31.5.0"))
//    implementation("com.google.firebase:firebase-auth-ktx")
//    implementation("com.google.android.gms:play-services-auth:20.5.0")

    androidTestImplementation(libs.androidx.espresso.intents.v361) // Add this line
}

