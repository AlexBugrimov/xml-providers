package dev.bug.xmlproviders.providers.yandex.models;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Shop {
  private String name;
  private String company;
  private String url;
  private String email;
  private String picture;
  private String description;

  @XmlElementWrapper(name = "currencies")
  @XmlElement(name = "currency")
  private List<Currency> currencies;

  @XmlElementWrapper(name = "categories")
  @XmlElement(name = "category")
  private List<Category> categories;

  @XmlElementWrapper(name = "offers")
  @XmlElement(name = "offer")
  private List<Offer> offers;

}
