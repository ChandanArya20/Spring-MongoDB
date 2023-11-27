package in.ineuron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDTO {

	private Integer no;
	private String name;
	private Float billAmt;
	private String[] mobo;

}
