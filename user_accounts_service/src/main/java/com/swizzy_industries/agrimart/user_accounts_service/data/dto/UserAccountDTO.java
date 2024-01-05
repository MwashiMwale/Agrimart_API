package com.swizzy_industries.agrimart.user_accounts_service.data.dto;

import java.util.List;

import org.bson.types.ObjectId;

import com.swizzy_industries.agrimart.user_accounts_service.data.documents.Addresses;
import com.swizzy_industries.agrimart.user_accounts_service.data.documents.Contacts;
import com.swizzy_industries.agrimart.user_accounts_service.data.documents.Name;
import com.swizzy_industries.agrimart.user_accounts_service.data.documents.Products;

public record UserAccountDTO(
		ObjectId id,
        Name fullName,
        String userName,
        Contacts contact,
        Addresses address,
        List<Products> products
) {}
