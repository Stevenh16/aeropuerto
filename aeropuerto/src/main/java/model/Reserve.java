package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reserves")
public class Reserve {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="reserve_date")
    private LocalDateTime reserveDate;
    @Column(name="passengers_numbers")
    private int passengersNumbers;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="flight_id")
    private Flight flight;
}
