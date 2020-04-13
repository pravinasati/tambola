package com.innovatie.tambola.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Game {

  @Id
  @Column(name = "_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer ticketPrice;

  @OneToOne
  private Player player;

  @Type(type = "Text")
  private String description;
}
