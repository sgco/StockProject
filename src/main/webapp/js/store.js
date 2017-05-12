angular.module('Stock')
.controller('StoreUp',function($scope,$http,$routeParams){
	
	
	
		console.log($routeParams.id);
		$http({
			method :'GET',
			url : "http://localhost:8081/stock-web/rest/netstock/getStore/" + $routeParams.id
		}).then(function(response) {

		
			$scope.id =response.data.id;
			$scope.address =response.data.address;
			$scope.contactNumber=response.data.contactNumber;
			$scope.contactPerson=response.data.contactPerson;
			$scope.companyId=response.data.companyId;
			
			
			
			
		console.log(response.data);
		});
		
		
		
		
		 $scope.updateStore = function(){

			  var store= {
						id :$scope.id,
						address :$scope.address,
						contactNumber :$scope.contactNumber,
						contactPerson :$scope.contactPerson,
						companyId :$scope.companyId,
						};

		console.log(store);
		$http({
			method :'PUT',
			data : store,
			url : "http://localhost:8081/stock-web/rest/netstock/upStore"
		}).then(function(response) {

			$scope.show =true;
			$scope.message= "updated";
		});

		  }
		  

		
		$scope.Cancel = function(){
			
			
			$scope.id ="";
			$scope.address ="";
			$scope.contactNumber="";
			$scope.contactPerson="";
			$scope.companyId="";
			
			
		}
		
		
		
		
		
		
})