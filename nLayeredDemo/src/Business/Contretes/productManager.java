package Business.Contretes;

import java.util.List;

import Business.Abstacts.productService;
import DataAccess.Abstracts.productDao;
import Entities.Concretes.Product;
import core.Abstracts.jLoggerService;

public class productManager implements productService{

    private productDao productDao;
    private jLoggerService jLoggerService;

    public productManager(productDao productDao,jLoggerService jLoggerService) {
        this.productDao = productDao;
        this.jLoggerService=jLoggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getId()==2)
        {
            System.out.println("Bu kategoriye kabul edilmez");
            return;
        }
        this.productDao.add(product);
        this.jLoggerService.LogToSysytem("Loglandı");
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
