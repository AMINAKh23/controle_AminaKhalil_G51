package ma.xproce.aminakhalil_g51.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString


public class Computer {
    @Id
    @GeneratedValue

    private Long id;
    private String proc;
    private String ram;
    private String hardDrive;
    private String macAddress;
    double price;

}
