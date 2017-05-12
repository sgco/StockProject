package stock.stock_service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dto.Company;
import dto.Stock;
import dto.StockSupplier;
import dto.Store;
import dto.StoreStock;
import dto.Supplier;
import service.StockService;

public class StockServiceImpl implements StockService {
	
	//Company///////////////////////////////////////////////////////////////////////////
	
	static Map<Integer, Company> companyMap = new HashMap<Integer, Company>();
	static {
		Company c1 = new Company(1, "Intel",23);
		Company c2 = new Company(2, "HP",35);
		Company c3 = new Company(3, "FNB",32);
		companyMap.put(1, c1);
		companyMap.put(2, c2);
		companyMap.put(3, c3);

	}
	
	public Company createCompany(Company company) {
		companyMap.put(company.getCompanyID(), company);
		return company;
	}

 
	public Company updateCompany(Company company) {
		companyMap.put(company.getCompanyID(), company);
		return company;
	}

 
	public List<Company> deleteCompany(int id) {
		companyMap.remove(id);
		
		List<Company> companies = new ArrayList<Company>();

		for (Company company : companyMap.values()) {
				companies.add(company);
			}
		return companies;
	}

 
	public Company getCompany(int id) {
		return companyMap.get(id);
	}

	
    public List<Company> listCompanies() {

	List<Company> companies = new ArrayList<Company>();

	for (Company company : companyMap.values()) {
			companies.add(company);
		}
		return companies;
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
///////Store/////////////////////////////////////////Store///////////////////////////////////////////////////Store//////////////////////////////////////////Store///////////////////////////////////
	
	
	static Map<Integer, Store> storeMap = new HashMap<Integer, Store>();
	static {
		Store s1 = new Store(1,"12 ave","0893624463","tyson",1);
		Store s2 = new Store(2,"1gglave","0893624463","kat",6);
		Store s3 = new Store(3, "something","011","sam",32);
		storeMap.put(1, s1);
		storeMap.put(2, s2);
		storeMap.put(3,s3);

	}
	
	public Store createStore(Store store) {
		storeMap.put(store.getId(), store);
		return store;
	}

 
	public Store updateStore(Store store) {
		storeMap.put(store.getId(), store);
		return store;
	}

 
	public List<Store> deleteStore(int id) {
		storeMap.remove(id);
		
		List<Store> stores = new ArrayList<Store>();

		for (Store store : storeMap.values()) {
			stores.add(store);
		}
		
		
		return stores;
	}

 
	public Store getStore(int id) {
		return storeMap.get(id);
	}

 
	public List<Store>listStores() {

		List<Store> stores = new ArrayList<Store>();

		for (Store store : storeMap.values()) {
			stores.add(store);
		}
		return stores;
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
//////Stock////////////////////////Stock////////////Stock///////////////////////////Stock//////////////////////Stock//////////////////////////////////
	
	
	static Map<Integer, Stock> stockMap = new HashMap<Integer, Stock>();
	static {
		Stock s1 = new Stock(1,"100","grocery",true,234,1);
		Stock s2 = new Stock(2,"200","cosmetics",false,125,6);
		Stock s3 = new Stock(3,"300","home",true,56,32);
		stockMap.put(1,s1);
		stockMap.put(2,s2);
		stockMap.put(3,s3);

	}
	
	
	public Stock createStock(Stock stock) {
		stockMap.put(stock.getId(), stock);
		return stock;
	}

 
	public Stock updateStock(Stock stock) {
		stockMap.put(stock.getId(), stock);
		return stock;
	}

 
	public List<Stock> deleteStock(int id) {
		stockMap.remove(id);
		List<Stock> stocks = new ArrayList<Stock>();

		for (Stock stock : stockMap.values()) {
			stocks.add(stock);
		}
		return stocks;
	}

 
	public Stock getStock(int id) {
		return stockMap.get(id);
	}

 
	public List<Stock>listStocks() {

		List<Stock> stocks = new ArrayList<Stock>();

		for (Stock stock : stockMap.values()) {
			stocks.add(stock);
		}
		return stocks;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	//Supplier ////////////////////////////////////////////////////////SuPLLIERS////////////////////////////////////////////////////////////////////////
	static Map<Integer, Supplier> supplierMap = new HashMap<Integer, Supplier>();
	static {
		Supplier sup1 = new Supplier(1,"description","082547474","contact person","address","nozewug@hdh","refference","branch code","acc num","vat");
		Supplier sup2 = new Supplier(6,"description","082547474","contact person","address","nozewug@hdh","refference","branch code","acc num","vat");
		Supplier sup3 = new Supplier(2,"description","082547474","contact person","address","nozewug@hdh","refference","branch code","acc num","vat");
		supplierMap.put(1,sup1);
		supplierMap.put(2,sup2);
		supplierMap.put(3,sup3);

	}
	
	
	
	
	
	
	public Supplier createSupplier(Supplier supplier) {
		supplierMap.put(supplier.getId(), supplier);
		return supplier;
	}

 
	public Supplier updateSupplier(Supplier supplier) {
		supplierMap.put(supplier.getId(), supplier);
		return supplier;
	}

 
	public List<Supplier> deleteSupplier(int id) {
		supplierMap.remove(id);
		List<Supplier> suppliers = new ArrayList<Supplier>();

		for (Supplier supplier :supplierMap.values()) {
			suppliers.add(supplier);
		}
		
		return suppliers;
	}

 
	public Supplier getSupplier(int id) {
		return supplierMap.get(id);
	}

 
	public List<Supplier>listSuppliers() {

		List<Supplier> suppliers = new ArrayList<Supplier>();

		for (Supplier supplier :supplierMap.values()) {
			suppliers.add(supplier);
		}
		return suppliers;
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
/////////storeStock ////////////storestock////////////////////////////////////////////storestock////////////////////////////////////////////////////	
	
	static Map<Integer, StoreStock> storeStockMap = new HashMap<Integer, StoreStock>();
	static {
		StoreStock s1 = new StoreStock();
		StoreStock s2 = new StoreStock();
		StoreStock s3 = new StoreStock();
		storeStockMap.put(1,s1);
		storeStockMap.put(2,s2);
		storeStockMap.put(3,s3);

	}
	
	/*
	    private Long id;
	    
	    
	    private Long quantity;
	    
	    private Long minQuantity;

	    private Long pendingQuantity;

	    private Long missingQuantity;
	*/
	
	

	public StoreStock createStoreStock(StoreStock stock) {
		storeStockMap.put(stock.getId(), stock);
		return stock;
	}

 
	public StoreStock updateStoreStock(StoreStock stock) {
		storeStockMap.put(stock.getId(), stock);
		return stock;
	}

 
	public String deleteStoreStock(int id) {
		storeStockMap.remove(id);
		return "deleted";
	}

 
	public StoreStock getStoreStock(int id) {
		return storeStockMap.get(id);
	}

 
	public List<StoreStock>listStoreStocks() {

		List<StoreStock> stocks = new ArrayList<StoreStock>();

		for (StoreStock stock :storeStockMap.values()) {
			stocks.add(stock);
		}
		return stocks;
	}


	

	

	


	


	
	
	
}
