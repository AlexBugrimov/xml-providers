package dev.bug.xmlproviders.providers.yandex.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

  @XmlAttribute
  private String id;

  @XmlAttribute
  private String rate;

  public void setId(String id) {
    this.id = id;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }
}
