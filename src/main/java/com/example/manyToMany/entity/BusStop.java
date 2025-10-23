package com.example.manyToMany.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "bus_stop")
public class BusStop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name="stop_id")
    private Stop stop;

    @Column(name="order_Number",nullable = false)
    private Integer orderNumber;

    @Column(name="deparature_time",nullable = false)
    private LocalDateTime deparatureTime;

}
// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request

// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request

// added comment in busStop to check alll the process for pull request

// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request

// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request


// added comment in busStop to check alll the process for pull request
// added comment in busStop to check alll the process for pull request

// added comment in busStop to check alll the process for pull reque


