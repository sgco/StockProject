angular.module('Stock')
.controller('StockUp',function($scope,$http,$routeParams){




	$http({
		method :'GET',
		url : "http://localhost:8081/stock-web/rest/netstock/getStock/" + $routeParams.id
	}).then(function(response) {

		$scope.id=response.data.id;
        $scope.code=response.data.code;
		$scope.description=response.data.description;
		$scope.requireSerialNo=response.data.requireSerialNo;
		$scope.measurementId=response.data.measurementId;
		$scope.childCount=response.data.childCount;
	    console.log(response.data);
	});

	
			
		$scope.Cancel = function(){
			$scope.id="";
	        $scope.code="";
			$scope.description="";
			$scope.requireSerialNo="";
			$scope.measurementId="";
			$scope.childCount="";
			
		}
			
			




$scope.updateStock = function(){

	  var stock= {
				id : $scope.id,
		        code :$scope.code,
				description:$scope.description,
				requireSerialNo:$scope.requireSerialNo,
				measurementId:$scope.measurementId,
				childCount:$scope.childCount
		}
		

console.log(stock);
$http({
	method :'PUT',
	data : stock,
	url : "http://localhost:8081/stock-web/rest/netstock/upStock"
}).then(function(response) {

	
	$scope.show =true;
	$scope.message= "updated";
});

}







});