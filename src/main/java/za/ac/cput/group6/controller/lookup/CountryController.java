package za.ac.cput.group6.controller.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.service.lookup.impl.CountryServiceImpl;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired


    private CountryServiceImpl countryService;

    @GetMapping("/getall")
    public List<Country> getAll(){
        return countryService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Country country){
        countryService.delete(country.getName());
    }
    @PutMapping("/update")
    public Country update(@RequestBody Country country){
        return countryService.update(country);
    }
    @GetMapping("/read/{name}")
    public Optional<Country> read(@PathVariable String name) {
        return countryService.read(name);
    }

    @PostMapping("/create")
    public Country create(@RequestBody Country country){
        return countryService.create(country);
    }

}
