package ru.ezhov.exservice.takes;

import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rs.RsVelocity;
import ru.ezhov.exservice.beans.Link;
import ru.ezhov.exservice.script.Holder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TkIndex implements Take {

    private Holder<List<Link>> listHolder;

    public TkIndex(Holder<List<Link>> listHolder) {
        this.listHolder = listHolder;
    }

    public Response act(Request request) throws IOException {


        return new RsVelocity(
                this.getClass().getResource("/index.html"),
                new RsVelocity.Pair("links", listHolder.get()),
                new RsVelocity.Pair("nameProject", "GROOVY STRINGS TEMPLATES")
        );
    }
}
