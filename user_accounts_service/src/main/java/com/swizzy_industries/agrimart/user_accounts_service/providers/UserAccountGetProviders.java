package com.swizzy_industries.agrimart.user_accounts_service.providers;

import com.swizzy_industries.agrimart.user_accounts_service.data.dto.UserAccountDTO;
import com.swizzy_industries.agrimart.user_accounts_service.repositories.UserAccountsRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Service
public class UserAccountGetProviders {

    @Autowired
    private UserAccountsRepository userRepo;

    public Flux<UserAccountDTO> getAllUsers() {
        return userRepo.findAll()
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Mono<UserAccountDTO> getUserById(ObjectId id){
        return userRepo.findById(id)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Mono<UserAccountDTO> getUserByUserName(String username) {
        return userRepo.findUserByUserName(username)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Mono<UserAccountDTO> getUserByEmail(String email) {
        return userRepo.findUserByEmail(email)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Flux<UserAccountDTO> getUserWithName(
            String firstname,
            String lastname,
            String surname,
            List<String> othername
    ) {

/*
        List<UserAccountDTO> withFirstName = new ArrayList<>();
        List<UserAccountDTO> withLastName = new ArrayList<>();
        List<UserAccountDTO> withOtherName = new ArrayList<>();
        List<UserAccountDTO> withSurName = new ArrayList<>();

        List<String> namesFlux = List.of();
*/
/*
        Flux<UserAccountDTO> names = namesFlux.stream().forEach(
                userRepo.findUserByFirstName(firstname)
                        .filter(result1 -> userRepo.findUserByLastName(lastname).equals(result1))
                                .flatMap(result2 -> userRepo.findUserByOtherName(othername)
                                        .flatMap(result3 -> userRepo.findUserBySurName(surname))
                                )).
        );
*/

        return userRepo.findAll()
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Flux<UserAccountDTO> getAllUsersWithPhoneNumber(String countryCode, Integer phoneNumber) {
        return userRepo.findUsersWithPhoneNumber(countryCode, phoneNumber)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Flux<UserAccountDTO> getUsersFromCountry(String country) {
        return userRepo.findUserByCountry(country)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Flux<UserAccountDTO> getUsersFromCounty(String county) {
        return userRepo.findUserByCounty(county)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

    public Flux<UserAccountDTO> getUsersFromSubCounty(String subCounty) {
        return userRepo.findUserBySubCounty(subCounty)
                .map(entity -> new UserAccountDTO(
                        entity.getId(),
                        entity.getFullName(),
                        entity.getUserName(),
                        entity.getContact(),
                        entity.getAddress(),
                        entity.getProducts()
                ));
    }

}
