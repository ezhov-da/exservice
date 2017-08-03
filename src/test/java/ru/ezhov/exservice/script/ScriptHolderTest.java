package ru.ezhov.exservice.script;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScriptHolderTest {
    @Test
    public void get() throws Exception {
        String result = "test";

        String scriptExecute = "\"test\"";

        Holder<String> stringHolder = new ScriptHolder(scriptExecute);

        assertEquals(result, stringHolder.get());
    }
}