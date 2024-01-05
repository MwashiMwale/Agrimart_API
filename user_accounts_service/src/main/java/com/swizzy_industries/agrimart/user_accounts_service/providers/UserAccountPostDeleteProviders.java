package com.swizzy_industries.agrimart.user_accounts_service.providers;

import com.swizzy_industries.agrimart.user_accounts_service.repositories.UserAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountPostDeleteProviders {

    @Autowired
    private UserAccountsRepository userRepo;



}
