package firstprogram

class ProgrammingExercise1 {
	
	static void main(args) {
		//Un-initialized variables
		def x
		int y
		
		//Array
		def arr=[1,2.0,"Saahil",true,x,y]
		arr.each { println "Value is: " +it +"Data type is :" +it.getClass()}
	}
}
