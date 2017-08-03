package ru.ezhov.exservice.script;

import ru.ezhov.exservice.beans.Link;

import java.util.ArrayList;
import java.util.List;

public class LinksHolder implements Holder<List<Link>> {

    private final String TEST_LINK =
            "https://raw.githubusercontent.com/ezhov-da/groovy/master/scripts/src/main/groovy/ru/ezhov/parser_text_to_column.groovy";

    public List<Link> get() {

        return new ArrayList<Link>() {
            {
                add(new Link("Test1", TEST_LINK, "sdasdasgas", "sdgasdgasdg"));
                add(new Link("Test2", TEST_LINK, "agag", "ahash"));
                add(new Link("Test3", TEST_LINK, "sgasrasrh", "ashsadhsadh"));
                add(new Link("Test4", TEST_LINK, "ashash", "ashash"));
            }
        };
    }
}
