package com.swizzy_industries.agrimart.user_accounts_service.data.documents;

import lombok.Builder;
import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_contacts")
@Data
@Builder
public class Contacts {
	@Id
	private ObjectId id;
    @Indexed(unique = true)
    private String email;
    private Integer phoneNumber;
    private String countryCode;
    private String postalCode;
}
