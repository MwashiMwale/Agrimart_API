package com.swizzy_industries.agrimart.user_accounts_service.data.documents;

import lombok.Builder;
import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user_fullnames")
@Data
@Builder
public class Name {
	@Id
	private ObjectId id;
    private String firstName;
    private String lastName;
    private List<String> otherName;
    private String surname;
}
