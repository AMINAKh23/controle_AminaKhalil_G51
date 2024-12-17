package ma.xproce.aminakhalil_g51.web;



import ma.xproce.aminakhalil_g51.dto.ComputerDto;
import ma.xproce.aminakhalil_g51.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {

    @Autowired
    private ComputerService computerService;

    @QueryMapping
    public List<ComputerDto> getAllComputers() {
        return computerService.getAllComputers();
    }

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDTO) {
        return computerService.saveComputer(computerDTO);
    }

    @MutationMapping
    public boolean deleteComputer(@Argument Long id) {
        return computerService.deleteComputer(id);
    }
}