package firstprogram

class ProgrammingExercise4 {
	static void main(def args) {
		def str="This is a Groovy Language"
		
		//Reversing the string
		def RevStr=str.reverse()
		println "Reversed string:" +RevStr
		
		//Printing a subString
		def SubStr=str.substring(10)
		println "Substring:"+SubStr
		
		//Splitting the string
		def splitStr=str.split(" ")
		println "split string: "+splitStr
		
		//Removing words from the string
		def minusStr=str.minus("Groovy")
		println "String after removal: "+minusStr
		
		//Lowercase and Uppercase string
		def lowerStr=str.toLowerCase()
		def upperStr=str.toUpperCase()
		println "Lowercase string:" +lowerStr
		println "Uppercase string:"+upperStr
		
		//REGEX OPERATIONS
		//matches()
		def matchStatus=str.matches("(.*)Groovy(.*)")
		if (matchStatus) {println "String matches"}
		
		//replaceAll()
		def replaceWith="very Groovy"
		println(str.replaceAll("Groovy",replaceWith))
		//Notice that the original string is not changed
		println str
		
	}
}
