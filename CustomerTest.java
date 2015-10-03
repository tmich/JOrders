import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CustomerTest {
  @Test
  public void shouldRetainData() {
    Customer customer = new Customer();
    customer.setName("Cliente");
    assertEquals(customer.getName(), "Cliente");
  }
}
