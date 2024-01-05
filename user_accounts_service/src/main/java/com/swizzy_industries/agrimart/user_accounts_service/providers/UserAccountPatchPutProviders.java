package com.swizzy_industries.agrimart.user_accounts_service.providers;


import com.swizzy_industries.agrimart.user_accounts_service.repositories.UserAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountPatchPutProviders {

    @Autowired
    private UserAccountsRepository userRepo;

    /*
    public Mono<UserAccountModel> updateUserWithId(
            Long id,
            UserAccountDTO newUser,
            UserAddressDTO userAddress,
            UserContactDTO userContact,
            UserNameDTO userFullName
    ) {
        return userRepo.findById(id).map(oldUser -> {
            oldUser.setUserName(newUser.userName());
            oldUser.setFullName(
                    newUser.fullName().setFirstName(userFullName.firstName()),
                    newUser.fullName().setLastName(userFullName.lastName()),
                    newUser.fullName().setOtherName(userFullName.otherNames()),
                    newUser.fullName().setSurname(userFullName.surName())
            );
            oldUser.setContact(
                    newUser.contact().setCountryCode(userContact.countryCode()),
                    newUser.contact().setEmail(userContact.email()),
                    newUser.contact().setPhoneNumber(userContact.phoneNumber()),
                    newUser.contact().setPostalCode(userContact.postalCode())
            );
            oldUser.setAddress(
                    newUser.address().setCountry(userAddress.country()),
                    newUser.address().setCounty(userAddress.county()),
                    newUser.address().setSubCounty(userAddress.subCounty())
            );
            
            return oldUser;
        }).flatMap(oldUser -> userRepo.save(oldUser));
    }
     */
}
