package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.Product;

public interface productDao {

    public void add(Product product);
    public void update(Product product);
    public void delete(Product product);
    Product get(int id);
    List<Product> getAll();
    
}
