pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(url = "https://github.com/thainguyen2303/base-library/raw/main/score/libs")
        maven(url = "https://github.com/ToanMobile/SDKAds/raw/main/sdk_ads/libs")
        google()
        mavenCentral()

    }
}

rootProject.name = "BaseApp"
include(":app")
include(":score")
