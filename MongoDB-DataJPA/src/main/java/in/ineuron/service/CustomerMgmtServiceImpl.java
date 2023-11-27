package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ineuron.document.Customer;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.idgenerator.IdGenerator;
import in.ineuron.repository.ICustomerRepo;

@Service("service")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerRepo repo;

	@Override
	@Transactional
	public String registerCustomer(CustomerDTO dto) {
		Customer document = new Customer();
		BeanUtils.copyProperties(dto, document);
		document=repo.insert(document);
		return "Document is saved with the id :: " + document.getId();
	}
	
	@Override
	@Transactional
	public String insertCustomer(CustomerDTO dto) {
		Customer document = new Customer();
		document.setId("cf56bcda01");
		BeanUtils.copyProperties(dto, document);
		return "Document is saved/updated with the id :: " + repo.save(document).getId();
	}

	@Override
	public List<Customer> findAllCustomer() {
		
		return repo.findAll();
	}

	@Override
	@Transactional
	public String deleteCustomer(String id) {
		
		Optional<Customer> optional = repo.findById(id);
		
		if(optional.isPresent()) {
			repo.delete(optional.get());
			return "Data deleted successfully...";
		}
		return "Data not found...";
	}
	
	@Override
	public List<Customer> fetchRecordByPriceRange(float startPrice, float endPrice) {
		
		return repo.findByBillAmtBetween(startPrice, endPrice);
	}
	@Override
	public List<Customer> fetchRecordByNameHavingMobileNo(String... names) {
		
		return repo.findByNameInAndMoboIsNotNull(names);
	}
	

	
}
