package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Builder
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="airlines")
public class Airline {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="airline_code")
    private String airlineCode;
    @Column(name="county_origin")
    private String countyOrigin;
    @OneToMany(mappedBy = "airline", fetch = FetchType.EAGER)
    private ArrayList<Flight> flights;
}
