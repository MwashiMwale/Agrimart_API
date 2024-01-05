package com.swizzy_industries.agrimart.user_accounts_service.data.dto;

import org.bson.types.ObjectId;

public record UserContactDTO(
		ObjectId id,
        String email,
        Integer phoneNumber,
        String countryCode,
        String postalCode
) {
}
