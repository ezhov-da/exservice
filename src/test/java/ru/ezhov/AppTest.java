package ru.ezhov;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.takes.rq.RqFake;
import org.takes.rs.RsPrint;
import ru.ezhov.exservice.App;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void returnsHttpResponse() throws Exception {
//        MatcherAssert.assertThat(
//                new RsPrint(
//                        new App().act(new RqFake("GET", "/"))
//                ).printBody(),
//                Matchers.equalTo("hello, world!")
//        );
    }
}
