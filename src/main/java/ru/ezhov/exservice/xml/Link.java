package ru.ezhov.exservice.xml;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author ezhov_da
 */
@XmlRootElement(name = "link")
@XmlAccessorType(XmlAccessType.FIELD)
public class Link {

    private static final Logger LOG =
            Logger.getLogger(Link.class.getName());

    private String name;
    private String url;
    private String description;

    @XmlElementWrapper(name = "elements")
    @XmlElement(name = "element")
    private List<Element> elements;

    public Link() {
    }

    public Link(
            String name,
            String url,
            String description,
            List<Element> elements) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }


}
