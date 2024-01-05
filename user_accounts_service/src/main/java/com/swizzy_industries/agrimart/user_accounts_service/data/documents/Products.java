/**
 * 
 */
package com.swizzy_industries.agrimart.user_accounts_service.data.documents;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

/**
 * 
 */
@Document(collection = "products")
@Data
@Builder
public class Products {
	@Id
	private ObjectId id;
	private List<String> name;
}
