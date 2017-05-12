package service;








import dto.Company;
import dto.Stock;

import dto.Store;
import dto.StoreStock;

import dto.Supplier;



import java.util.List;




import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;


@Path("/netstock")
public interface StockRest {

 

 
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/companies")
    public List<Company> listCompanies();
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newCompany")
    public Company addCompany(Company company);
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upCompany")
    public Company updateCompany(Company company);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getCompany/{id}")
    public Company getCompany(@PathParam("id") int companyId);
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remCompany/{id}")
    public List<Company> removeCompany(@PathParam("id") int companyId);
       
  
    
 

    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newStock")
    public Stock addStock(Stock stock);
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upStock")
    public Stock updateStock(Stock stock);


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remStock/{id}")
    public List<Stock> removeStock(@PathParam("id")int stockId);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getStock/{id}")
    public Stock getStock(@PathParam("id") int stockId);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/stocks")
    public List<Stock> listStocks();
    
    //***
    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newStore")
    public Store addStore(Store store);
       
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upStore")
    public Store updateStore(Store store) ;
        
    
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remStore/{id}")
    public List<Store> removeStore(@PathParam("id")int storeId);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getStore/{id}")
    public Store getStore(@PathParam("id")int storeId);
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/stores")
    public List<Store> listStores();
    
    
    
    
    

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/newSupplier")
    public Supplier addSupplier(Supplier supplier);
        

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/upSupplier")
    public Supplier updateSupplier(Supplier supplier);
        
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/suppliers")
    public List<Supplier> getSupplierList() ;
    
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/remSupplier/{id}")
    public List<Supplier> removeSupplier(@PathParam("id") int supplierId);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getSupplier/{id}")
    public Supplier getSupplier(@PathParam("id")int supplierId);
    
    
    
    
    
    
    
    
    
    
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/storeStock")
    public StoreStock updateStoreStock(StoreStock storeStock);
       
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/storeStock")
    public List<StoreStock> getStoreStockList();
       

    
    
    
    
    
    
  
}

	
	
	
	
	
	
	

