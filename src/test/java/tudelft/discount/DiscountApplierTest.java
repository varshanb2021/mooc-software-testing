package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void categoryHome(){
        Product p1 = new Product("TV",5000,"HOME");
        Product p2 = new Product("TV",5000,"BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(p1,p2);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discount = new DiscountApplier(dao);
          discount.setNewPrices();

        Assertions.assertEquals(4500,p1.getPrice());
        Assertions.assertEquals(5500,p2.getPrice());
    }


}
