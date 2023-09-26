package dev.bug.xmlproviders.providers.yandex.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Category {

  @XmlAttribute
  private String id;

  @XmlAttribute
  private String parentId;

  private String value;

  public void setId(String id) {
    this.id = id;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
