package DataAccess.Concretes;

import java.util.List;

import DataAccess.Abstracts.productDao;
import Entities.Concretes.Product;

public class hibernateProductDao implements productDao{

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi: "+product.getName());
        
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Product get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
