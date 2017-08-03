package ru.ezhov.exservice.script;

import org.javalite.http.Http;

public class WebHolder implements Holder<String> {

    private final String urlToScript;

    public WebHolder(String urlToScript) {
        this.urlToScript = urlToScript;
    }

    public String get() {
        return Http.get(urlToScript).text();
    }
}
