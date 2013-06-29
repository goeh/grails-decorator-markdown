class DecoratorMarkdownGrailsPlugin {
    def version = "0.2"
    def grailsVersion = "2.0 > *"
    def dependsOn = [:]
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Markdown Decorator Plugin"
    def author = "Goran Ehrsson"
    def authorEmail = "goran@technipelago.se"
    def description = '''\
Markdown support for the decorator-plugin
'''

    def documentation = "http://grails.org/plugin/decorator-markdown"
    def license = "APACHE"
    def organization = [ name: "Technipelago AB", url: "http://www.technipelago.se/" ]

    def issueManagement = [ system: "github", url: "https://github.com/goeh/grails-decorator-markdown/issues" ]
    def scm = [ url: "https://github.com/goeh/grails-decorator-markdown" ]
}
