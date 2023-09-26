package dev.bug.xmlproviders.providers.eduson.models;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "channel")
public class Channel {

  @XmlElement(name = "title")
  private String title;

  @XmlElement(name = "link")
  private String link;

  @XmlElement(name = "description")
  private String description;

  @XmlElement(name = "item")
  private List<Item> items;
}