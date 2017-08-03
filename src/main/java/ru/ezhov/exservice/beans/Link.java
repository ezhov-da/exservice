package ru.ezhov.exservice.beans;

import java.util.logging.Logger;

/**
 *
 * @author ezhov_da
 */
public class Link
{
    private static final Logger LOG = Logger.getLogger(Link.class.getName());

    private String name;
    private String link;
    private String description;
    private String script;

    public Link(String name, String link, String description, String script)
    {
        this.name = name;
        this.link = link;
        this.description = description;
        this.script = script;
    }

    public String getName()
    {
        return name;
    }

    public String getLink()
    {
        return link;
    }

    public String getDescription()
    {
        return description;
    }

    public String getScript()
    {
        return script;
    }


}
