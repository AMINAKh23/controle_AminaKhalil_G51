package ma.xproce.aminakhalil_g51.service;


import ma.xproce.aminakhalil_g51.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    ComputerDto saveComputer(ComputerDto computerDTO);
    boolean deleteComputer(Long id);
    List<ComputerDto> getAllComputers();
}