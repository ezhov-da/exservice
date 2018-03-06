package ru.ezhov.exservice.script;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebHolderTest {

    @Test
    public void test() {
        String urlToScript =
                "https://raw.githubusercontent.com/ezhov-da/groovy-scripts/master/src/main/groovy/ru/ezhov/parserTextToColumn.groovy";
        Holder<String> stringHolder = new WebHolder(urlToScript);
        String result = stringHolder.get();


        assertEquals("//test string", result.substring(0, 13));
    }

}