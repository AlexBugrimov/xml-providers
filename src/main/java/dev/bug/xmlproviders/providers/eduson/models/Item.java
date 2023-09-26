package dev.bug.xmlproviders.providers.eduson.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item", namespace = "http://base.google.com/ns/1.0")
public class Item {

  @XmlElement(name = "title", namespace = "http://base.google.com/ns/1.0")
  private String title;

  @XmlElement(name = "image_link", namespace = "http://base.google.com/ns/1.0")
  private String imageLink;

  @XmlElement(name = "learning_type", namespace = "http://base.google.com/ns/1.0")
  private String learningType;

  @XmlElement(name = "product_key", namespace = "http://base.google.com/ns/1.0")
  private String productKey;

  @XmlElement(name = "product_description", namespace = "http://base.google.com/ns/1.0")
  private String productDescription;

  @XmlElement(name = "product_url", namespace = "http://base.google.com/ns/1.0")
  private String productUrl;

  @XmlElement(name = "program_url", namespace = "http://base.google.com/ns/1.0")
  private String programUrl;

  @XmlElement(name = "installment_price", namespace = "http://base.google.com/ns/1.0")
  private String installmentPrice;

  @XmlElement(name = "demo_url", namespace = "http://base.google.com/ns/1.0")
  private String demoUrl;

  @XmlElement(name = "duration_months", namespace = "http://base.google.com/ns/1.0")
  private String durationMonths;

  @XmlElement(name = "full_price", namespace = "http://base.google.com/ns/1.0")
  private String fullPrice;

  @XmlElement(name = "discount_deadline", namespace = "http://base.google.com/ns/1.0")
  private String discountDeadline;

  @XmlElement(name = "discount", namespace = "http://base.google.com/ns/1.0")
  private String discount;

  @XmlElement(name = "discount_amount", namespace = "http://base.google.com/ns/1.0")
  private String discountAmount;

  @XmlElement(name = "discounted_price", namespace = "http://base.google.com/ns/1.0")
  private String discountedPrice;
}