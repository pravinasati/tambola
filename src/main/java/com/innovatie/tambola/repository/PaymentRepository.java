package com.innovatie.tambola.repository;

import com.innovatie.tambola.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
