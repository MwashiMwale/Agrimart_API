package com.swizzy_industries.agrimart.user_accounts_service.data.dto;

import java.util.List;

import org.bson.types.ObjectId;

public record UserAddressDTO(
		ObjectId id,
        String country,
        String county,
        String subCounty,
        List<String> landmarks
) {
}
