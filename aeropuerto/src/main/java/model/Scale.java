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
@Table(name="scales")
public class Scale {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="time")
    private LocalDateTime time;
    @ManyToMany
    @JoinTable(
            name = "flights_scales",
            joinColumns = @JoinColumn(name = "scale_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id", referencedColumnName = "id")
    )
    private ArrayList<Flight> flights;
}
