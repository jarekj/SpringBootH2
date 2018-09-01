package database.controller;


import database.dto.AuthorDto;
import database.model.Address;
import database.model.Author;
import database.repository.AddressRepository;
import database.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;
    private AddressRepository addressRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository, AddressRepository addressRepository) {
        this.authorRepository = authorRepository;
        this.addressRepository = addressRepository;
    }

    @PostMapping
    public AuthorDto create(@RequestParam String firstname,
                            @RequestParam String lastname,
                            @RequestParam Long addresId) {
        Address address = addressRepository.findOne(addresId);
        Author author = new Author(firstname, lastname, address);
        return new AuthorDto(authorRepository.save(author));
    }

    @GetMapping
    public Set<Author> findAll(){
        return authorRepository.findAllBy();
    }

    @DeleteMapping
    public void deleteByUuid(){

    }


}
