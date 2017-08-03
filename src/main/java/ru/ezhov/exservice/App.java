package ru.ezhov.exservice;

import com.jcabi.log.Logger;
import org.takes.facets.fork.FkMethods;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.tk.TkSlf4j;
import ru.ezhov.exservice.script.LinksHolder;
import ru.ezhov.exservice.takes.TkGroovy;
import ru.ezhov.exservice.takes.TkIndex;

import java.io.IOException;

public final class App {
    public static void main(final String... args) {
        Logger.info(App.class, "start application");

        try {
            new FtBasic(
                    new TkFork(
                            new FkRegex(
                                    "/",
                                    new TkSlf4j(
                                            new TkIndex(
                                                    new LinksHolder()
                                            )
                                    )
                            ),
                            new FkRegex(
                                    "/execute",
                                    new TkFork(
                                            new FkMethods(
                                                    "POST,PUT",
                                                    new TkGroovy(new LinksHolder())
                                            )

                                    )
                            )
                    ),
                    10110
            ).start(Exit.NEVER);
        } catch (IOException e) {
            Logger.error(e, "very strange error: %s", e.getMessage());
            Logger.trace(e, "trace");
        }
    }
}