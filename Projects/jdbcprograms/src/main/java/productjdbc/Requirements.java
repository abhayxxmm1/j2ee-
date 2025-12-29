package productjdbc;

public interface Requirements {

	 static String URL="jdbc:postgresql://localhost:5432/jspiders";
	 static String password="root";
	 static String username="postgres";
	
	void insertProduct() throws Exception;
	void updateProductPrice()  throws Exception;
	void deletePrice()  throws Exception;
	void fetchById()	 throws Exception;
	void fetchByPrice() throws Exception;
	void fetchAll() throws Exception;
}
