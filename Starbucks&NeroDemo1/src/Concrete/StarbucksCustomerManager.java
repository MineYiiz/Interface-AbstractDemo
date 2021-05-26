package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public  void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Save to db : " + customer.getFirstName());
		}else{
			System.out.println("Not a valid person");
		}
		
	}


}
//