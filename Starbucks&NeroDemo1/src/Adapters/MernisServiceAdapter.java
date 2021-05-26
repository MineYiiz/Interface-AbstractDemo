package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			return kpsProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
				    customer.getDateOfBirth().getYear()
				    
					);
		} catch (NumberFormatException | RemoteException e) {
			System.out.println("Not a valid person"); 
		}
		return result;
	}
	

}
