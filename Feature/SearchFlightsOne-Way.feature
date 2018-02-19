Feature: Search Flights One-Way 

Scenario Outline: Search Flights One-Way in clear trip 
	Given Enter the cleartrip url
	When User Enter the Flight details "<fromValue>" "<ToValue>""<DepartOn>""<AdultCount>""<ChildrenCount>""<InfantsCount>"
	Then Search result should display 	
	Examples: 
		| fromValue | ToValue | DepartOn 		   | AdultCount | ChildrenCount | InfantsCount |
        |    Mumbai |  Delhi  | Thu, 15 Feb, 2018 |3  		    |1 			    |0			   |
#        |    Mumbai |  Delhi  | Thu, 15 Feb, 2018 |4  		    |2			    |1			   |
		


#	Scenario Outline: Search Flights for round trip in clear trip 
#	Given Enter the cleartrip url
#	When User Enter the Flight details for round Trip "<fromValue>" "<ToValue>""<DepartOn>""<ReturnOn>""<AdultCount>""<ChildrenCount>""<InfantsCount>"
#	Then Search result should display for round trip 
#	
#	Examples: 
#		| fromValue | ToValue | DepartOn 		  |ReturnOn			| AdultCount | ChildrenCount | InfantsCount |
#        |    Mumbai |  Delhi  | Thu, 15 Feb, 2018 |Thu, 16 Feb, 2018|3  		 |1 			 |0			    |
#        |    Mumbai |  Delhi  | Thu, 15 Feb, 2018 |Thu, 16 Feb, 2018|4  		 |2			     |1			    |