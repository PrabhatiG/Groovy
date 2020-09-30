package firstprogram

class RegexExample2 {
	public static void main (String[] args) { 
	
		//Store the result in a variable
		def x= { vars ->
		
		}=~/\S+er\b/
		
		//find() returns true/false
		println x.find() //true
		
		//findAll returns a list of all matches
		println x.findAll() //[ever, after]
		
	}
}
