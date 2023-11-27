package in.ineuron.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

//	@MongoId
	@Id
	private String id;

	@NonNull
	private Integer no;

	@NonNull
	private String name;

	@NonNull
	private Float billAmt;
	
	@NonNull
	private String[] mobo;

}
