package com.example.manyToMany.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

//    @ManyToMany
//    @JoinTable(name = "bus_stops",
//            joinColumns = @JoinColumn(name = "bus_id"),
//            inverseJoinColumns = @JoinColumn(name = "stops_id"))
//    private Set<Stop> stops = new LinkedHashSet<>();


}

// added comment in busStop to check alll the process for pull request