angular.module('Stock',['ngRoute'])
.config(['$routeProvider',function($routeProvider){
	
	
	$routeProvider.when('/person',{
		templateUrl : 'person.html',
		controller : 'Arrays'
		})
		.when('/company',{
		templateUrl : 'Company.html',
		controller : 'Company'
		})
		.when('/AddCompany/:companyID',{
		templateUrl : 'CompanyAdd.html',
		controller : 'CompanyUpdate'
		})
		.when('/CompanyAdd',{
		templateUrl : 'AddCompany.html',
		controller : 'CompanyUpdate'
		})
		.when('/stock',{
			templateUrl : 'Stock.html',
			controller : 'Stockks'
		})
		.when('/AddStock',{
			templateUrl : 'StockAdd.html',
			controller : 'Stockks'
		})
		.when('/UpStock/:id',{
			templateUrl : 'StockUpdate.html',
			controller : 'StockUp'
		})
		.when('/store',{
		templateUrl : 'Store.html',
		controller : 'Store'
		})
		.when('/AddStore',{
		templateUrl : 'StoreAdd.html',
		controller : 'Store'
		})
		.when('/UpStore/:id',{
		templateUrl : 'StoreUpdate.html',
		controller : 'StoreUp'
		})
		.when('/storeStock',{
			templateUrl : 'StoreStock.html',
			controller : 'StoreStock'
		})
	   .when('/supplier',{
			templateUrl : 'Supplier.html',
			controller : 'Supplier'
		})
	    .when('/AddSupplier',{
			templateUrl : 'SupplierAdd.html',
			controller : 'Supplier'
		})
        .when('/UpSupplier/:id',{
			templateUrl : 'SupplierUpdate.html',
			controller : 'SupplierUp'
		})
	
}]);

