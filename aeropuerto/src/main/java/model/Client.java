package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="lastname")
    private String lastname;
    @Column(name="address")
    private String address;
    @Column(name="phone_number")
    private String phone_number;
    @Column(name="email")
    private String email;
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private ArrayList<Reserve> reserves;
}
