package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="flights")
public class Flight {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="airline_id")
    private Airline airline;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airport_origin_id")
    private Airport airport_origin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airport_destination _id")
    private Airport airport_destination;

    @Column(name="exit_date")
    private LocalDateTime exitDate;
    @Column(name="exit_time")
    private LocalDateTime exitTime;
    @Column(name="duration")
    private LocalDateTime duration;
    @Column(name="capacity")
    private int capacity;
    @ManyToMany(mappedBy = "flights")
    private ArrayList<Scale> scales;
}