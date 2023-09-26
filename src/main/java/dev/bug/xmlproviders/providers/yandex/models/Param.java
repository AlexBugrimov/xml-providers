package dev.bug.xmlproviders.providers.yandex.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Param {
  @XmlAttribute
  private String name;

  @XmlAttribute
  private String order;

  @XmlAttribute
  private String unit;

  @XmlAttribute
  private String hours;

  @XmlValue
  private String value;

}
