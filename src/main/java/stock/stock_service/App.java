package stock.stock_service;

import java.util.ArrayList;
import java.util.List;

import dto.Company;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	
    	
    	 StockServiceImpl impl = new  StockServiceImpl();
    	System.out.println("gco");
    	 List<Company> companies = new ArrayList<Company>();
    	for( Company c :companies ){
    	
    	System.out.println(c.getDescription());
    	}
    }
}
