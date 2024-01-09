dependencies {
    implementation(project(":api"))
    implementation(project(":common"))
    implementation("com.rometools:rome:2.1.0")
}

tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
