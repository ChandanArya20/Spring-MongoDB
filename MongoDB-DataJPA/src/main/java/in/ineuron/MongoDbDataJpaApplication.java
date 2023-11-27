package in.ineuron;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.document.Customer;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.CustomerMgmtServiceImpl;

@SpringBootApplication
public class MongoDbDataJpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MongoDbDataJpaApplication.class, args);
		
		CustomerMgmtServiceImpl service = context.getBean(CustomerMgmtServiceImpl.class);
		
		String[] mobo= {"9876764568","7864534689"};
//		System.out.println(service.registerCustomer(new CustomerDTO(12,"Rihana",1200.0f,mobo)));
//		System.out.println(service.registerCustomer(new CustomerDTO(45,"chandan",12000.0f,mobo)));
//		System.out.println(service.registerCustomer(new CustomerDTO(112,"Sanju",10200.0f,mobo)));
//		System.out.println(service.insertCustomer(new CustomerDTO(17,"virt",40000.0f,mobo)));
		
//		List<Customer> list = service.findAllCustomer();
//		list.forEach(System.out::println);
		
//		System.out.println(service.deleteCustomer("64441eab4e770365b46b0d01"));
		
//		
//		List<Customer> list = service.fetchRecordByPriceRange(30000, 50000);
//		list.forEach(System.out::println);
//		
		service.fetchRecordByNameHavingMobileNo("Virat","Dhoni","chandan","rihana","Muskan").forEach(System.out::println);
		
		((ConfigurableApplicationContext) context).close();
	}

}
