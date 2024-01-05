dependencies {
    implementation(project(":api"))
    implementation(project(":common"))
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
