plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "cozzly"

include("applications:accounts")
include("applications:houses")
include("applications:activities")

findProject(":applications:accounts")?.name = "accounts"
findProject(":applications:houses")?.name = "houses"
findProject(":applications:activities")?.name = "activities"
