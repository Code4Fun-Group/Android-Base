
object Versions {
    private const val versionCodeBase = 1 // XYYZZM; M = Module (tv, mobile)
    const val versionName = "1.0.0" // X.Y.Z; X = Major, Y = minor, Z = Patch level
    const val versionCodeMobile = versionCodeBase + 3

    const val COMPILE_SDK = 31
    const val TARGET_SDK = 31
    const val MIN_SDK = 21
    
    const val CORE = "1.6.0"
    const val ACTIVITY = "1.2.0-rc01"
    const val FRAGMENT = "1.3.0"
    const val APPCOMPAT = "1.3.1"
    const val MATERIAL = "1.4.0-beta01"
    const val LIFECYCLE = "2.4.0-rc01"
    const val DATA_STORE = "1.0.0-beta01"
    const val GSON = "2.8.6"

    const val ANDROID_GRADLE_PLUGIN = "7.0.2"
    const val BENCHMARK = "1.0.0"
    const val COMPOSE = "1.1.0-alpha05"
    const val COIL = "1.4.0"
    const val FIREBASE_CRASHLYTICS = "2.3.0"
    const val GOOGLE_SERVICES = "4.3.3"
    const val KOTLIN = "1.5.31"
    const val NAVIGATION = "2.3.5"
    const val HILT_AGP = "2.38.1"
    const val MOCKK = "1.12.0"
    const val ARCH_TESTING = "2.0.0"
    const val ROOM = "2.2.5"
    const val OKHTTP = "4.9.1"
    const val PAGING = "3.0.1"
    const val RETROFIT = "2.9.0"
    const val PALETTE = "1.0.0"
    const val ACCOMPANIST = "0.17.0"

    const val JUNIT = "4.13"
    const val JUNIT_EXT = "1.1.1"
    const val ESPRESSO = "3.4.0"

}

object AndroidLibraries {
    const val gradle = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE}"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:${Versions.LIFECYCLE}"
    const val LIFECYCLE_LIVE_DATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE}"
    const val LIFECYCLE_VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
    const val ARCH_TESTING = "androidx.arch.core:core-testing:${Versions.ARCH_TESTING}"

    const val ROOM_COMMON = "androidx.room:room-common:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_TESTING = "androidx.room:room-testing:${Versions.ROOM}"
    const val DATA_STORE_PREFERENCES = "androidx.datastore:datastore-preferences:${Versions.DATA_STORE}"

    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT_AGP}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT_AGP}"
    const val HILT_TESTING = "com.google.dagger:hilt-android-testing:${Versions.HILT_AGP}"
    const val HILT_GRADLE_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT_AGP}"

    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"

    const val PALETTE = "androidx.palette:palette:${Versions.PALETTE}"
}

object PagingLibraries {
    const val COMMON = "androidx.paging:paging-common-ktx:${Versions.PAGING}"
    const val RUNTIME = "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"
}

object ComposeLibraries {
    const val ACTIVITY = "androidx.activity:activity-compose:1.3.1"
    const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.COMPOSE}"
    const val FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
    const val ANIMATION = "androidx.compose.animation:animation:${Versions.COMPOSE}"
    const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val RUNTIME = "androidx.compose.runtime:runtime:${Versions.COMPOSE}"
    const val TEST = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
    const val THEME_ADAPTER = "com.google.android.material:compose-theme-adapter:${Versions.COMPOSE}"
    const val TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val UI_VIEWBINDING = "androidx.compose.ui:ui-viewbinding:${Versions.COMPOSE}"
    const val UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val UI_UTIL = "androidx.compose.ui:ui-util:${Versions.COMPOSE}"

    const val HILT_NAVIGATION = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
    const val NAVIGATION = "androidx.navigation:navigation-compose:2.4.0-alpha07"
    const val PAGING = "androidx.paging:paging-compose:1.0.0-alpha12"
    const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"

}

// An image loading library for Android backed by Kotlin Coroutines
object CoilLibraries {
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
    const val GIF = "io.coil-kt:coil-gif:${Versions.COIL}"
}

object AccompanistLibraries {
    const val FLOWLAYOUT = "com.google.accompanist:accompanist-flowlayout:${Versions.ACCOMPANIST}"
    const val INSETS = "com.google.accompanist:accompanist-insets:${Versions.ACCOMPANIST}"
    const val INSETS_UI = "com.google.accompanist:accompanist-insets-ui:${Versions.ACCOMPANIST}"
    const val NAVIGATION_ANIMATION = "com.google.accompanist:accompanist-navigation-animation:${Versions.ACCOMPANIST}"
    const val SWIPEREFRESH = "com.google.accompanist:accompanist-swiperefresh:${Versions.ACCOMPANIST}"
    const val PAGER = "com.google.accompanist:accompanist-pager:${Versions.ACCOMPANIST}"
    const val PAGER_INDICATORS = "com.google.accompanist:accompanist-pager-indicators:${Versions.ACCOMPANIST}"
}

object KotlinLibraries {
    const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN}"
    const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    const val EXTENSIONS = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.KOTLIN}"
    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLIN}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLIN}"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.KOTLIN}"
}

object NetworkLibraries {
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
}

object TestLibraries {
    const val EXT_JUNIT = "androidx.test.ext:junit:${Versions.JUNIT_EXT}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val ESPRESSO_CONTRIB = "androidx.test.espresso:espresso-contrib:${Versions.ESPRESSO}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
}