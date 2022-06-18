package za.ac.cput.group6.controller.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.service.lookup.impl.CityServiceImpl;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityServiceImpl cityService;

    @GetMapping("/getall")
    public List<City> getAll(){
        return cityService.getAll();
    }

    @GetMapping("/read/{name}")
    public Optional<City> getCountry(@PathVariable String name) {
        return cityService.read(name);
    }

    @PostMapping("/create")
    public City create(@RequestBody City city){
        return cityService.create(city);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }
    @PutMapping("/update")
    public City update(@RequestBody City city){
        return cityService.update(city);
    }

}
