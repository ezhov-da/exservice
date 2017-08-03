package ru.ezhov.exservice.script;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebHolderTest {

    @Test
    public void test() {
        String urlToScript =
                "https://raw.githubusercontent.com/ezhov-da/groovy/master/scripts/src/main/groovy/ru/ezhov/parser_text_to_column.groovy";
        Holder<String> stringHolder = new WebHolder(urlToScript);
        String result = stringHolder.get();


        assertEquals("//test string", result.substring(0, 13));
    }

}