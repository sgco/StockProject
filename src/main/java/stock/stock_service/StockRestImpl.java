package stock.stock_service;

import java.util.List;

import dto.Company;
import dto.Stock;
import dto.Store;
import dto.StoreStock;
import dto.Supplier;


import service.StockRest;
import service.StockService;



public class StockRestImpl implements StockRest{

	

	StockService stockService=new StockServiceImpl();
	
	 
    public List<Company> listCompanies(){
    return	stockService.listCompanies();
    }
    
    public Company addCompany(Company company){
        return stockService.createCompany(company);
        }
        
        public Company updateCompany(Company company){
        	return stockService.updateCompany(company);
        }
        public List<Company> removeCompany(int companyId){
        	return stockService.deleteCompany(companyId);
        }
        public Company getCompany(int companyId){
        	return stockService.getCompany(companyId);
        }
    
    
    
   
    
    
    
    
    
    
    public Stock addStock(Stock stock){
    return stockService.createStock(stock);
    }
    
    public Stock updateStock(Stock stock){
    	return stockService.updateStock(stock);
    }
    public List<Stock> removeStock(int stockId){
    	return stockService.deleteStock(stockId);
    }
   
    public Stock getStock(int stockId){
    	return stockService.getStock(stockId);
    }

    public List<Stock> listStocks(){
    	return stockService.listStocks();
    }
    
    
    
    
  
    public Store addStore(Store store){
    	return stockService.createStore(store);
    }
    public Store updateStore(Store store) {
    	return stockService.updateStore(store);
    }
    
    public List<Store> removeStore(int storeId){
    	return stockService.deleteStore(storeId);
    }
   
    public Store getStore(int storeId){
    	return stockService.getStore(storeId);
    }

    public List<Store> listStores(){
    	return stockService.listStores();
    }
    
    
    
    
    
    
    
    
        

    public Supplier addSupplier(Supplier supplier){
    	return stockService.createSupplier(supplier);
    }
    public Supplier updateSupplier(Supplier supplier){
    	return stockService.updateSupplier(supplier);
    }
    public List<Supplier> getSupplierList() {
    	return stockService.listSuppliers();
    }
    
    public List<Supplier> removeSupplier(int supplierId){
    	return stockService.deleteSupplier(supplierId);
    }
   
    public Supplier getSupplier(int supplierId){
    	return stockService.getSupplier(supplierId);
    }

    
    
    
    
    
   
    
    public StoreStock updateStoreStock(StoreStock storeStock){
    	return stockService.updateStoreStock(storeStock);
    }
    public List<StoreStock> getStoreStockList(){
    	return stockService.listStoreStocks();
    }

	

	
	



	


	
   
    
    
}