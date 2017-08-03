package ru.ezhov.exservice.script;

import groovy.lang.GroovyShell;

public class ScriptHolder implements Holder<String> {

    private String script;

    public ScriptHolder(String script) {
        this.script = script;
    }

    public String get() {

        GroovyShell groovyShell = new GroovyShell();

        return (String) groovyShell.evaluate(script);
    }
}
