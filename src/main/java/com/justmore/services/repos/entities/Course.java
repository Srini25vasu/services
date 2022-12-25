package com.justmore.services.repos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Course")
public class Course {
  int courseId;
  String name;
  Date startDate;
  long durationInHours;

  public Course() {

  }
}
