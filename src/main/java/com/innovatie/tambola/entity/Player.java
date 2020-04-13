package com.innovatie.tambola.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Player {

  @Id
  @Column(name = "_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


}
