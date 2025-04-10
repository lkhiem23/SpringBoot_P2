package com.lesson07.CRUD_OneToMany_DB.service;

@Service
public class ProductService {
  @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Lấy danh sách
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        System.out.println(categories);
        return categories;
    }

    public Optional<Category> getProductById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
