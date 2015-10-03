import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CustomerRepositoryTest {
	@Test
	public void test() {
		CustomerRepository repo = new CustomerRepository();
		Customer customer = new Customer();
		customer.setName("Cliente");
		long id = repo.store(customer);
		assertEquals(customer, repo.get(id));
	}
}

