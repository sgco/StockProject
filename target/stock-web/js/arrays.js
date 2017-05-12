angular.module('ArrayPrac',[])
.controller('Arrays',function($scope){
	
	$scope.People = [
	{id:1,
		name : 'Gcobisa',
	surname: 'Nozewu',
	age :15
	},
	{id:2,
		name : 'Litha',
	surname: 'Nzewu',
	age :25
	},
	{id:3,
		name : 'Xolani',
	surname: 'Bekelephi',
	age :35
	}
	];
	
	$scope.addPerson= function(){
		
		$scope.People.push(
		{id:$scope.id,
		 name : $scope.name,
	     surname:$scope.surname,
	     age :$scope.age
	    }
		
		);
		}
		
		$scope.deletePerson=function(index){
			
			$scope.People.splice(index,1);
			alert("Person Deleted");
			
		}
	
	
	
})