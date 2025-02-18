plugins {
    `aegis-java`
    `aegis-publish`
    `aegis-repositories`
}

dependencies {
    implementation(project(":aegis-codec-common"))
    implementation(libs.jackson.databind)
}

aegisPublish {
    artifactId = "aegis-codec-jackson"
}