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
        //maven(url = "https://github.com/thainguyen2303/base-library/row/main/score/libs")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://github.com/thainguyen2303/base-library/row/main/score/libs")
        maven(url = "https://github.com/ToanMobile/SDKAds/raw/main/sdk_ads/libs")
    }
}

rootProject.name = "BaseApp"
include(":app")
include(":score")
