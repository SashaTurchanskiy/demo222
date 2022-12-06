package testMyExpirience.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mng")
public class Manager {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Long id;
    private String firstName;
    private String lastName;
    private int sales;


    @OneToMany(mappedBy = "manager")
    private List<Sale> saleList;
}



