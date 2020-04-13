package com.innovatie.tambola.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Data
@Entity
public class Ticket {

  @Id
  private Long id;

//  @Type(type = "")
  private String ticket;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  private Player player;
}
