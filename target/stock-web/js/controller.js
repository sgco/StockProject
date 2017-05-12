angular.module('ArrayPrac')
.controller('Arrays',function($scope,$http){
	
	
	
	$scope.addPerson = function(){
		$scope.People={
			id : $scope.id,
			name:$scope.name,
			surname : $scope.surname,
			age :$scope.age
				}
		
		$http.post('http://localhost:8080/Crud/rest/Person/Add',$scope.People).then(function(response){
			alert("Person has been added");
			$scope.People = response.data;
			
			
			
		})
		
		
	}
	
	
	
	
	$scope.ViewPeople = function(){
		
	$http.get('http://localhost:8080/Crud/rest/Person/List').then(function(response){
		
		$scope.People = response.data;
		
		
		
	})
	
	}
	
	
	
	
	$scope.DeletePerson = function(){
		
		$http.get('http://localhost:8080/Crud/rest/Person/Delete/'+ $scope.id).then(function(response){
			
			alert(response.data);
			
			
			
		})
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
})










