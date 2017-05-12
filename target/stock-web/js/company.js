angular.module('Stock')
.controller('CompanyUpdate',function($scope,$http,$routeParams){


	
	
	$http(
			{
				method : 'GET',
				url : "http://localhost:8081/stock-web/rest/netstock/getCompany/"
						+ $routeParams.companyID
			}).then(function(response) {
		
		$scope.companyID= response.data.companyID;
		$scope.description = response.data.description;
		$scope.stores = response.data.stores;
		
		console.log(response.data);
		
		});
	
	
	
	
	$scope.updateCompany = function() {

		
		var company ={
				companyID :$scope.companyID,
				description :$scope.description,
				stores :$scope.stores
					
		};
		
		
		
		
		$http(
				{
					method : 'PUT',
					data : company,
					url : "http://localhost:8081/stock-web/rest/netstock/upCompany"
				}).then(function(response) {

			
			console.log(response.data);
			$scope.show =true;
			$scope.message= "updated";
		});

	};

	


	$scope.Cancel = function() {
		
		$scope.companyID= "";
		$scope.description = "";
		$scope.stores = "";
		
		

	};

	
	$scope.addCompany = function() {
		
		var company ={
				companyID :$scope.companyID,
				description :$scope.description,
				stores :$scope.stores
					
		};
		
		

		$http(
				{
					method : 'POST',
					data : company,
					url : "http://localhost:8081/stock-web/rest/netstock/newCompany"
				}).then(function(response) {

			
					$scope.show =true;
					$scope.message= "added";
		});

	};
	

	




});