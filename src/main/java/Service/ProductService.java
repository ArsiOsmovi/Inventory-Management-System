package Service;


import Converter.ProductConverter;
import Entity.Product;
import Model.ProductRequest;
import dao.ProductDao;

public class ProductService {
    ProductDao productDao = new ProductDao();
    public Product createProduct(ProductRequest request){
        Product entity = ProductConverter.convertToEntity(request);


        productDao.createProduct(entity);

        return entity;

    }
}
