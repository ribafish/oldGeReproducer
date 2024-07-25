pluginManagement {
    plugins {
        kotlin("jvm") version "2.0.0"
    }
}
rootProject.name = "oldGeReproducer"

plugins {
    id("com.gradle.enterprise") version("3.17.6")
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.13"
}

gradleEnterprise {
//    server = "https://ge.solutions-team.gradle.com/"
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"

        publishAlways()
        isUploadInBackground = System.getenv("CI") == null

        capture {
            isTaskInputFiles = true
        }
    }
}
