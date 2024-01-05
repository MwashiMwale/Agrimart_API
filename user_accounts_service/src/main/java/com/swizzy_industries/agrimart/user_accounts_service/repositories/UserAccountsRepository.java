package com.swizzy_industries.agrimart.user_accounts_service.repositories;

import com.swizzy_industries.agrimart.user_accounts_service.data.documents.UserAccountModel;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.graphql.data.GraphQlRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQlRepository
public interface UserAccountsRepository extends ReactiveMongoRepository<UserAccountModel, ObjectId> {

    Mono<UserAccountModel> findUserByUserName(String username);

    @Query("{'UserAccountModel.fullName'}")
    Flux<UserAccountModel> findUsersByAnyName(String fullname);

    @Query("{'UserAccountModel.fullName.firstName'}")
    Mono<UserAccountModel> findUserByFirstName(String firstname);

    @Query("{'UserAccountModel.fullName.lastName'}")
    Mono<UserAccountModel> findUserByLastName(String lastname);

    @Query("{'UserAccountModel.fullName.otherName'}")
    Mono<UserAccountModel> findUserByOtherName(List<String> otherName);

    @Query("{'UserAccountModel.fullName.surName'}")
    Mono<UserAccountModel> findUserBySurName(String surname);

    @Query("{'UserAccountModel.address.country'}")
    Flux<UserAccountModel> findUserByCountry(String country);

    @Query("{'UserAccountModel.address.county'}")
    Flux<UserAccountModel> findUserByCounty(String county);

    @Query("{'UserAccountModel.address.subCounty'}")
    Flux<UserAccountModel> findUserBySubCounty(String subCounty);

    @Query("{'UserAccountModel.contact.email'}")
    Mono<UserAccountModel> findUserByEmail(String email);

    @Query("{'UserAccountModel.contact.phoneNumber','UserAccountModel.contact.countryCode'}")
    Flux<UserAccountModel> findUsersWithPhoneNumber(String countryCode, Integer phoneNumber);

}
