package com.example.inditex.persistence;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
@Data
public class Prices {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRICES_ID")
	private Integer pricesId;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id")
	private Brand brand;

	@Column(name = "START_DATE")
	private LocalDateTime startDate;

	@Column(name = "END_DATE")
	private LocalDateTime endDate;

	@Column(name = "PRICE_LIST")
	private String priceList;

	@Column(name = "PRODUCT_ID")
	private String productId;
	
	@Column(name = "PRIORITY")
	private String priority;

	@Column(name = "PRICE")
	private String price;

	@Column(name = "CURR")
	private String curr;


}
