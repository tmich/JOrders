import java.util.List;
import java.util.ArrayList;

public class CustomerRepository implements IRepository<Customer> {

	private List<Customer> db;
	static long id = 1;
	
	public CustomerRepository() {
		db = new ArrayList<>();
	}
	
	@Override
	public Customer get(long Id){
		Customer found = null;
		for(Customer customer : db) {
			if(customer.getId() == Id) {
				found = customer;
				break;
			}
		}
		return found;
	}
	
	@Override
	public long store(Customer customer) {
		customer.setId(id++);
		db.add(customer);
		return customer.getId();
	}
	
	@Override
	public List<Customer> findBy(Object criteria) {
		return null;
	}
	
	@Override
	public List<Customer> getAll() {
		return db;
	}
}
