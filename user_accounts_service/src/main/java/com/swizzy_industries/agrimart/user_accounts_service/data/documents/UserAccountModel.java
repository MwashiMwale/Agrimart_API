package com.swizzy_industries.agrimart.user_accounts_service.data.documents;

import lombok.Builder;
import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user_accounts")
@Data
@Builder
public class UserAccountModel {
	@Id
	private ObjectId id;
    private Name fullName;
    @Indexed(unique=true)
    private String userName;
    private Contacts contact;
    private Addresses address;
    private List<Products> products;
}
