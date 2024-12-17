package ma.xproce.aminakhalil_g51.mapper;
import org.modelmapper.ModelMapper;

import ma.xproce.aminakhalil_g51.dao.entities.Computer;
import ma.xproce.aminakhalil_g51.dto.ComputerDto;
import org.springframework.stereotype.Component;



@Component
public class ComputerMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDto computerDTO) {
        return mapper.map(computerDTO, Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer) {
        return mapper.map(computer, ComputerDto.class);
    }
}