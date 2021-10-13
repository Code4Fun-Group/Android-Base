plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Versions.COMPILE_SDK

    defaultConfig {
        applicationId = "vn.c4f.androidbase"
        minSdk = Versions.MIN_SDK
        targetSdk = Versions.TARGET_SDK
        versionCode = Versions.versionCodeMobile
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE
    }
    packagingOptions {
        resources.excludes += "META-INF/AL2.0"
        resources.excludes += "META-INF/LGPL2.1"
    }
}

dependencies {

    implementation (AndroidLibraries.CORE_KTX)
    implementation (AndroidLibraries.APPCOMPAT)
    implementation (AndroidLibraries.MATERIAL)
    implementation (AndroidLibraries.LIFECYCLE_RUNTIME_KTX)
    implementation (ComposeLibraries.UI)
    implementation (ComposeLibraries.MATERIAL)
    implementation (ComposeLibraries.TOOLING)
    implementation (ComposeLibraries.ACTIVITY)
    testImplementation (TestLibraries.JUNIT)
    androidTestImplementation (TestLibraries.EXT_JUNIT)
    androidTestImplementation(TestLibraries.ESPRESSO_CORE)
    androidTestImplementation (ComposeLibraries.TEST)
    debugImplementation (ComposeLibraries.TOOLING)
}