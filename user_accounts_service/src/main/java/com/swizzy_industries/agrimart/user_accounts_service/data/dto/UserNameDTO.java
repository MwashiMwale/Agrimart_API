package com.swizzy_industries.agrimart.user_accounts_service.data.dto;

import java.util.List;

import org.bson.types.ObjectId;

public record UserNameDTO(
		ObjectId id,
        String firstName,
        String lastName,
        List<String> otherNames,
        String surName
) {
}
