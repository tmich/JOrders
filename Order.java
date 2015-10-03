import java.util.Date;

public class Order implements IBusinessObject {
	long id;
	Customer customer;
	//List<OrderItems> items;
	Date creationDate;
	//User user;
	
	public Order(Customer customer) {
		this.customer = customer;
	}
	
	public long getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
}
