object Dependencies {

    object AndroidX {

        const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE}"
        const val LIFECYCLE_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.RUNTIME}"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
        const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}"

        object Test {
            const val TEST_CORE = "androidx.test:core:${Versions.TEST_CORE}"
            const val TEST_RUNNER = "androidx.test:runner:${Versions.TEST_RUNNER}"
            const val JUNIT = "androidx.test.ext:junit:1.1.5"
            const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
        }
    }

    object Compose {

        object Test {
            const val JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"
            const val TOOLING = "androidx.compose.ui:ui-tooling"
            const val MANIFEST = "androidx.compose.ui:ui-test-manifest"
        }
    }

    object Vanniktech {

        const val EMOJI_GOOGLE = "com.vanniktech:emoji-google:0.18.0"
        const val EMOJI_IOS = "com.vanniktech:emoji-ios:0.18.0"
        const val EMOJI_FACEBOOK = "com.vanniktech:emoji-facebook:0.18.0"
        const val EMOJI_TWITTER = "com.vanniktech:emoji-twitter:0.18.0"
    }

    object Test {

        const val JUNIT = "junit:junit:${Versions.JUNIT}"
    }

    object Kotlin {

        const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val KOTLIN_STD = "org.jetbrains.kotlin:kotlin-stdlib-jdk8${Versions.KOTLIN}"
    }

    object Gradle {

        const val BUILD = "com.android.tools.build:gradle:${Versions.GRADLE}"
    }

    const val DOKKA = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.DOKKA}"
    const val SNAPPER = "dev.chrisbanes.snapper:snapper:${Versions.SNAPPER}"
    const val DESUGAR = "com.android.tools:desugar_jdk_libs:${Versions.DESUGAR}"

    const val MAVEN_PUBLISH = "com.vanniktech:gradle-maven-publish-plugin:${Versions.MAVEN_PUBLISH}"
}