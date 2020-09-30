package firstprogram

class Loops {
	static main(args) {
		def list=["Lars","Ben","Jack"]
		
		//Using a variable assignment
		list.each { 
			firstName->println firstName
			
		}
		//using the it variable
		list.each { println it }
	}
}
