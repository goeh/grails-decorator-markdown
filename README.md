# Markdown Decorator - Grails Plugin

This plugin adds Markdown support to the [decorator](https://github.com/goeh/grails-decorator) plugin.
The decorator plugin uses pluggable decorators to modify markup in GSP pages.
The standard decorator can convert URLs www.mycompany.com to clickable hyperlinks.
This plugin extends the decorator plugin and adds support for markdown syntax in parts of GSP pages.

-----

## Examples

    // The model
    text = "This plugin is **awesome!**"

    // GSP markup
    <g:decorate>${text}</g:decorate>

Produces the following HTML:

\<p>This plugin is \<strong>awesome!\</strong>\</p>

which renders:

This plugin is **awesome!**

You can use this plugin in your Grails application to allow your users to add markdown syntax to user profiles, comments, etc.

The source code for this decorator is **very** simple. It uses the [MarkdownJ](http://markdownj.org) library by Alex Coles:

    class MarkdownDecorator {

        String decorate(String text, Map params) {
            new MarkdownProcessor().markdown(text).trim()
        }
    }