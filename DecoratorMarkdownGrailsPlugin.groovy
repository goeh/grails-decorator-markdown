/*
 * Copyright (c) 2012 Goran Ehrsson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class DecoratorMarkdownGrailsPlugin {
    def version = "0.4"
    def grailsVersion = "2.0 > *"
    def dependsOn = [:]
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]
    def title = "Markdown Decorator Plugin"
    def author = "Goran Ehrsson"
    def authorEmail = "goran@technipelago.se"
    def description = '''\
Adds Markdown support to the decorator-plugin.
It uses the MarkdownJ (http://markdownj.org) library by Alex Coles
'''

    def documentation = "http://grails.org/plugin/decorator-markdown"
    def license = "APACHE"
    def organization = [ name: "Technipelago AB", url: "http://www.technipelago.se/" ]

    def issueManagement = [ system: "github", url: "https://github.com/goeh/grails-decorator-markdown/issues" ]
    def scm = [ url: "https://github.com/goeh/grails-decorator-markdown" ]
}
