package ma.xproce.aminakhalil_g51.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class ComputerDto {
    String proce;
    String ram;
    String harddrive;
    double price;
}
