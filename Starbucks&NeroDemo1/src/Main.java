

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		Customer customer= new Customer();
		customer.setId(1);
		customer.setFirstName("Mine");
		customer.setLastName("Yiðiz");
		customer.setDateOfBirth(LocalDate.of(1994, 10, 23));
		customer.setNationalityId("89654222222");
		
		
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer);

	}

}
