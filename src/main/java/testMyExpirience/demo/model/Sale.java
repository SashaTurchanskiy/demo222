package testMyExpirience.demo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sls")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;
    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    private Manager manager;


}
