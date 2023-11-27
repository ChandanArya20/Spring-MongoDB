package in.ineuron.service;

import java.util.List;

import in.ineuron.document.Customer;
import in.ineuron.dto.CustomerDTO;

public interface ICustomerMgmtService {
	public String registerCustomer(CustomerDTO dto);
	public List<Customer> findAllCustomer();
	public String deleteCustomer(String id);
	public String insertCustomer(CustomerDTO dto);
	public List<Customer> fetchRecordByPriceRange(float startPrice, float endPrice);
	public List<Customer> fetchRecordByNameHavingMobileNo(String... names);
	
}
