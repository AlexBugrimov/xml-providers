package dev.bug.xmlproviders.providers.yandex.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Offer {
  @XmlAttribute
  private String id;

  private String name;
  private String url;
  private String categoryId;
  private Integer price;
  private String currencyId;
  private String description;

  @XmlElement(name = "param")
  private List<Param> params;

  @XmlTransient
  private Map<String, Param> paramMap;

  @XmlTransient
  public Map<String, Param> getParamMap() {
    if (paramMap == null) {
      paramMap = new HashMap<>();
      for (Param param : params) {
        paramMap.put(param.getName(), param);
      }
    }
    return paramMap;
  }
}
