package ru.ezhov.exservice.takes;

import com.jcabi.log.Logger;
import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rq.form.RqFormSmart;
import org.takes.rs.RsText;
import ru.ezhov.exservice.beans.Link;
import ru.ezhov.exservice.script.Holder;
import ru.ezhov.exservice.script.WebHolder;

import java.io.IOException;
import java.util.List;

public class TkGroovy implements Take {

    private final Holder<List<Link>> listHolder;

    public TkGroovy(
            Holder<List<Link>> listHolder) {
        this.listHolder = listHolder;
    }

    public Response act(Request request) throws IOException {


        // final String textFrom = new RqFormSmart(request).single("textFrom");
        final String textId = new RqFormSmart(request).single("id");

        Logger.info(this, "input id: %s", textId);

        int id = Integer.parseInt(textId);

        Response response;

        //start Velocity foreach with 1
        if (id < 1 && id > listHolder.get().size()) {
            response = new RsText("error id");
        } else {

            Link link = listHolder.get().get(id - 1);

            Holder<String> webHolder = new WebHolder(link.getLink());
//            Holder<String> scriptHolder = new ScriptHolder(webHolder.get())
//            String textScript = scriptHolder.get();

            response = new RsText(webHolder.get());
        }


        //1. get url
        //2. get text
        //3. execute
        //4. return


        return response;

    }
}
