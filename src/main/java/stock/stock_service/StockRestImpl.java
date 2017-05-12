package stock.stock_service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import dto.Company;
import dto.Stock;
import dto.Store;
import dto.StoreStock;
import dto.StoreStockMovement;
import dto.StoreStockMovementDetail;
import dto.Supplier;
import dto.Transfer;

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
    
    
    
   // ********
    
    
    
    
    
    
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
    
    
    
    
    //**
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

	

	
	



	


	
   
    
    
    /*
    public Response checkinStoreStock(Long companyId,Long storeId) ;
       

    
    public Response adjustStoreStock(Long companyId,Long storeId) ;
    
   
    public Response getRootStockList();

    
    public Response getStockHierarchy();

    
    public Response getStockList(String description);

    
    public Response getStockSubList(final Long parentStockId);

    public Response addSubStock(Stock stock,final Long parentStockId);

    public Response getBankConfirmation(final Long supplierId) ;
        
    public Response getBBBEECertificate(final Long supplierId);
        
    public Response getStockPicture(final Long stockid) ;
       
    public Response getCompanyStoreList(Long companyId);
        
    public Response getStockMovement(Long companyId,Long storeId,  Long stockid);
       
    
    public Response addStockMovement(Long companyId,Long storeId);
        
    
    public Response getTransfers(Long companyId,Long storeId);
        

    
    public Response getTransferDetails(Long companyId,Long storeId,Long transferId) ;
       
    
    public Response updateTransferDetails(Long companyId,Long storeId,Long transferId) ;
       

   
    public Response transferStoreStock(Long companyId,Long storeId) ;
       
    public Response getStoreStockList(Long companyId,Long storeId);
       

    
    public Response addStoreStockitem(Long companyId, Long storeId, StoreStock storeStock) ;
      

    private dto.StoreStock getOrCreateStoreStock(Long storeId, Long stockId) ;
       
    private dto.Transfer createTransfer(StoreStockTransferList sstl) ;
       

    private dto.StoreStockMovement getStoreStockMovement(Long transferId, Long stockId) ;
       
    private StoreStockMovementDetail getStoreStockMovementDetail(Long transferId, String serialNo, Long stockId) ;


	public StoreStock getOrCreateStoreStock(Long storeId, Long stockId) {
		// TODO Auto-generated method stub
		return null;
	}


	public Transfer createTransfer(StoreStockTransferList sstl) {
		// TODO Auto-generated method stub
		return null;
	}


	public StoreStockMovement getStoreStockMovement(Long transferId, Long stockId) {
		// TODO Auto-generated method stub
		return null;
	}


	public StoreStockMovementDetail getStoreStockMovementDetail(Long transferId, String serialNo, Long stockId) {
		// TODO Auto-generated method stub
		return null;
	}
       
  

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
