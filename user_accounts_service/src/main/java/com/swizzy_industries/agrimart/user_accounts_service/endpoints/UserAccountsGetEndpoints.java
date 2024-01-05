package com.swizzy_industries.agrimart.user_accounts_service.endpoints;

import com.swizzy_industries.agrimart.user_accounts_service.data.dto.UserAccountDTO;
import com.swizzy_industries.agrimart.user_accounts_service.providers.UserAccountGetProviders;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class UserAccountsGetEndpoints {

    @Autowired
    private UserAccountGetProviders userGetService;

    @QueryMapping
    public Flux<UserAccountDTO> getAllUsers(){
        return userGetService.getAllUsers();
    }

    @QueryMapping
    public Mono<UserAccountDTO> getUserAccount(@Argument ObjectId id) {
        return userGetService.getUserById(id);
    }

//    @SchemaMapping
//    public Mono<UserContactDTO> getUserContact(@Argument Long id) {
//        return contactGetService.getUserById(id);
//    }
}
