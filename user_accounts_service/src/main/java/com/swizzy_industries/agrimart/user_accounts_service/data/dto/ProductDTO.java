package com.swizzy_industries.agrimart.user_accounts_service.data.dto;

import org.bson.types.ObjectId;

public record ProductDTO(
		ObjectId id,
		String name
) {
	
}
