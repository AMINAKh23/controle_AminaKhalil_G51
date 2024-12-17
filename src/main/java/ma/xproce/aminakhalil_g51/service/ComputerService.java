package ma.xproce.aminakhalil_g51.service;


import ma.xproce.aminakhalil_g51.dao.entities.Computer;
import ma.xproce.aminakhalil_g51.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    ComputerDto saveComputer(ComputerDto computerDTO);
    List<ComputerDto> getComputersByProc(String proc);
}