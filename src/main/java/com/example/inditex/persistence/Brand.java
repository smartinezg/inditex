package com.example.inditex.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "BRAND")
@Data
public class Brand {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "BRAND_ID")
  private Integer brandId;

  @Column(name = "BRAND_NAME")
  private String brandName;

  /*
  @OneToMany(mappedBy = "brand", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @Column(nullable = true)
  private Set<Prices> prices;
  */
}
