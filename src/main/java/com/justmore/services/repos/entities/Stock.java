package com.justmore.services.repos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Stock")
public class Stock {
  int courseId;
  String name;
  double currentNav;
  double prevNav;
  String stockTick;
  public Stock() {

  }
}
