pluginManagement {
    plugins {
        kotlin("jvm") version "2.0.0"
    }
}
rootProject.name = "oldGeReproducer"

plugins {
    id("com.gradle.develocity") version("3.17.6")
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.0.2"
}

develocity {
//    server.set("https://ge.solutions-team.gradle.com/")
    buildScan {
        termsOfUseUrl.set("https://gradle.com/help/legal-terms-of-use")
        termsOfUseAgree.set("yes")

        uploadInBackground.set(System.getenv("CI") == null)
    }
}
