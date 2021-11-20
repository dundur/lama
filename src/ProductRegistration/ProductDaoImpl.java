package ProductRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {
	ArrayList<Product> al = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addproduct() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the Product ID Number");
			int id = sc.nextInt();
			System.out.println("Enter the Product Name");
			String name = sc.next();
			System.out.println("Enter the product Quantity");
			int qty = sc.nextInt();
			System.out.println("Enter the product Price");
			int price = sc.nextInt();
			Product p = new Product(id, name, qty, price);
			al.add(p);
			System.out.println("The Product was Added Successfully");

		}
	}

	@Override
	public ArrayList<Product> viewAllProduct() {
		// TODO Auto-generated method stub
		return al;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		for (Product pt : al) {
			if (pt.getPid() == pid) {
				return pt;
			}
		}
		return null;
	}

	@Override
	public Product updateProduct(int pid) {
		// TODO Auto-generated method stub

		Scanner scl = new Scanner(System.in);
		for (Product upd : al) {

			if (upd.getPid() == pid) {
				System.out.println("*********************");
				System.out.println("     1)Product ID    ");
				System.out.println("     2)Product Name ");
				System.out.println("     3)Product Quantity    ");
				System.out.println("     4)Product Price  ");
				System.out.println("**********************");

				System.out.println("Please Enter the Choice You want to Update");
				int choice = scl.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Your new product ID");
					int id = scl.nextInt();
					upd.setPid(id);
					break;
				case 2:
					System.out.println("Enter Your new product name");
					String nm = scl.next();
					upd.setPname(nm);
					break;
				case 3:
					System.out.println("Enter Your new product quantity");
					int qu = scl.nextInt();
					upd.setPqty(qu);
					break;
				case 4:
					System.out.println("Enter Your new product price");
					int pc = scl.nextInt();
					upd.setPprice(pc);
					break;
				}// end of switch case

			} // end of if

		} // end of for loop
		return null;
	}

	@Override
	public Product deleteProduct(int pid) {
		// TODO Auto-generated method stub
		int k = 0;
	
		for (Product pt : al) {
			k++;

			if (pt.getPid() == pid) {
				al.remove(pt);
				System.out.println("Product delete Successfully");
				
			

			} else {
				k++;
			}
			

			
		}
		if(k==0) {
			System.out.println("Product not found");
			k++;
		}

		return null;
	}

}
