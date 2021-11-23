package Business.Abstacts;

import java.util.List;

import Entities.Concretes.Product;

public interface productService {

    public void add(Product product);
    List<Product> getAll();
    
}
