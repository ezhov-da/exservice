package ru.ezhov.exservice.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ezhov_da
 */
@XmlRootElement(name = "links")
@XmlAccessorType(XmlAccessType.FIELD)
public class Links {
    private static final Logger LOG =
            Logger.getLogger(Links.class.getName());

    @XmlElement(name = "link")
    private List<Link> links;

    public Links() {
        links = new ArrayList<Link>();
    }

    public Links(List<Link> links) {
        this.links = links;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }


}
