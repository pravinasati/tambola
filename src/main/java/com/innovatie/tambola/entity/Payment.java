package com.innovatie.tambola.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class Payment {

  @Id
  private Long id;

  private Long transactionId;

  private String paymentStatus;
  private LocalDateTime paymentDateTime;
  private Long amount;

  @OneToOne(fetch = FetchType.LAZY)
  private Game game;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  private Player player;

}
