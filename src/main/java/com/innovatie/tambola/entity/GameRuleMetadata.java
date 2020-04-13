package com.innovatie.tambola.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class GameRuleMetadata {

  @Id
  @Column(name = "_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String ruleName;

  @Type(type = "Text")
  private String description;

}
