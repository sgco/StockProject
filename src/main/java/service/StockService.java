package service;


import java.util.List;

import dto.Company;
import dto.Stock;
import dto.Store;
import dto.StoreStock;
import dto.Supplier;


public interface StockService {
	


    public List<Company> listCompanies();
    public Company createCompany(Company company);
    public List<Company> deleteCompany(int companyId);
    public Company updateCompany(Company company);
    public Company getCompany(int companyId);
    
    
    
    
    
    
    
    public Stock createStock(Stock stock);
    public List<Stock> deleteStock(int stockId);
    public Stock updateStock(Stock stock);
    public Stock getStock(int stockId);
    public List<Stock>listStocks();
    
    
    
    
        

   
    public Store createStore(Store store);
    public Store updateStore(Store store) ;
    public List<Store> deleteStore(int storeId);
    public Store getStore(int storeId);
    public List<Store>listStores();
    
    
    
    
    


    public Supplier createSupplier(Supplier supplier);
    public Supplier updateSupplier(Supplier supplier);
    public List<Supplier>listSuppliers() ;
    public List<Supplier>deleteSupplier(int supplierId);
    public Supplier getSupplier(int supplierId);
   
    
    
    
    
    
    public StoreStock updateStoreStock(StoreStock storeStock);
    public List<StoreStock>listStoreStocks();




    
    
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 

}

	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


