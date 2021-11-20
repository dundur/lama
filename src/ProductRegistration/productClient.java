package ProductRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class productClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductDaoImpl impl = new ProductDaoImpl();
		while (true) {
			System.out.println("*********************");
			System.out.println("     1)AddProduct     ");
			System.out.println("     2)ViewAllProduct  ");
			System.out.println("     3)ViewProduct     ");
			System.out.println("     4)UpdateProduct   ");
			System.out.println("     5)DeleteProduct    ");
			System.out.println("     6)Exit             ");

			System.out.println("**********************");

			System.out.println("Please Enter the Choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				impl.addproduct();
				break;

			case 2:
				ArrayList<Product> all = impl.viewAllProduct();
				for (Product pro : all) {
					if (pro != null) {
						System.out.println(pro.getPid() + " \t " + pro.getPname() + " \t " + pro.getPqty() + " \t "
								+ pro.getPprice());
					} else
						System.out.println("NO any product registered yet");
				}
				break;
			case 3:
				System.out.println("Enter the Product ID You wanna view");
				Product id = impl.viewProduct(sc.nextInt());
				if (id != null) {
					System.out.println(
							id.getPid() + " \t " + id.getPname() + " \t " + id.getPqty() + " \t " + id.getPprice());
				} else {
					System.out.println("The ID you provide is not matching");
				}
				break;
			case 4:
				System.out.println("Enter the Product ID to Update");
				int ide = sc.nextInt();
				impl.updateProduct(ide);
				break;
			case 5:
				System.out.println("Enter the Product ID you want to delete");
				int idd = sc.nextInt();
				impl.deleteProduct(idd);
				break;
			case 6:
				System.out.println("Thanks for using our application");
				System.exit(0);
				break;
			default:
				System.out.println("Please choose between 1 to 6 ");
				break;
			}
		}

	}

}
