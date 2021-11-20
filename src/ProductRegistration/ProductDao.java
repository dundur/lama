package ProductRegistration;

import java.util.ArrayList;

public interface ProductDao {
	void addproduct();
    ArrayList<Product> viewAllProduct();
	Product viewProduct(int pid);
	Product updateProduct(int pid);
	Product deleteProduct(int pid);

}
