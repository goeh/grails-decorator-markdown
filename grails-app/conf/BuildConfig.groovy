grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global")
    log "warn"
    legacyResolve false
    repositories {
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        compile "org.markdownj:markdownj-core:0.4"
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.2.1",
              ":rest-client-builder:1.0.3") {
            export = false
        }
        compile ":decorator:1.0"
    }
}
