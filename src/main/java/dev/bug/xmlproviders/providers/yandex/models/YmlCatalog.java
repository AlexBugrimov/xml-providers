package dev.bug.xmlproviders.providers.yandex.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "yml_catalog")
@XmlAccessorType(XmlAccessType.FIELD)
public class YmlCatalog{

  @XmlAttribute
  private String date;

  @XmlElement(name = "shop")
  private Shop shop;

}

