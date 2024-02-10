package Converter;

import Entity.Category;
import Entity.Product;
import Model.ProductRequest;

public class ProductConverter {

    public static Product convertToEntity(ProductRequest request){
        Product product = new Product();
        product.setTitle(request.getTitle());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setCategory(new Category(request.getCatId()));
        return product;
    }
}
