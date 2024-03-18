package ib.ts_2.controller;

import ib.ts_2.entity.Hire;
import ib.ts_2.repository.HireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hire")
public class HireController {

    private final HireRepository hireRepository;

    @Autowired
    public HireController(HireRepository hireRepository){
        this.hireRepository = hireRepository;
    }

    @PostMapping("/add")
    public @ResponseBody Hire addHire(@RequestBody Hire hire){
        return hireRepository.save(hire);
    }

    @GetMapping("/getAll")
    public @ResponseBody Iterable<Hire> getAllBooks(){
        return hireRepository.findAll();
    }

}
