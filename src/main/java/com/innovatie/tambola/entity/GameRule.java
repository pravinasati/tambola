package com.innovatie.tambola.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Data
@Entity
public class GameRule {

  @Id
  private Integer id;

  @OneToOne
  @MapsId
  private Game game;

  @OneToOne(fetch = FetchType.LAZY)
  private GameRuleMetadata gameRuleMetadata;

  private Integer prize;

  @Type(type = "Text")
  private String description;
}
