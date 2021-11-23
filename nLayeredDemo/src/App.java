import Business.Abstacts.productService;
import Business.Contretes.productManager;
import DataAccess.Concretes.abcProductDao;
import Entities.Concretes.Product;
import core.Concretes.JLoggerManagerAdapter;

public class App {
    public static void main(String[] args) throws Exception {
        productService productService=new productManager(new abcProductDao(),new JLoggerManagerAdapter());

        Product product=new Product(1, 1, 49, "Börek", 25.0);
        productService.add(product);
    }
}
