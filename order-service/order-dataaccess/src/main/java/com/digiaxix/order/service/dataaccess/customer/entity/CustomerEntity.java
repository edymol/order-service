package com.digiaxix.order.service.dataaccess.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_customer_m_view", schema = "customers")
@Entity
public class CustomerEntity {

    @Id
    private UUID id;

//    private String username;
//    private String firstName;
//    private String lastName;

}