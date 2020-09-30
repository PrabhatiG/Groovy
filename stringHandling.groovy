package firstprogram

class stringHandling {
	public static void main (args) {
		def name="John"
		def s1="Hello $name"
		def s2='Hello $name'
		println s1
		println s2
		
		//print type of variable
		println s1.getClass()
		println s2.getClass()
		
		// demonstrates object references and method calls
		def date=new Date()
		println "We met at $date"
	}
}
