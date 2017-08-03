package ru.ezhov.exservice.xml;

import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ezhov_da
 */
@XmlRootElement(name = "element")
@XmlAccessorType(XmlAccessType.FIELD)
public class Element
{
    private static final Logger LOG =
            Logger.getLogger(Element.class.getName());

    @XmlAttribute()
    private String name;
    @XmlAttribute()
    private String type;

    public Element()
    {
    }

    public Element(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }


}
