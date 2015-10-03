import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrderTest {
  @Test
  public void shouldRetainData() {
    Customer customer = new Customer();
    customer.setName("Cliente");
    Order order = new Order(customer);
    assertEquals(order.getCustomer().getName(), "Cliente");
  }
}
