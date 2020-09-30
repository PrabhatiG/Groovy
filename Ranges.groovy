package firstprogram

class Ranges {
	static void main(String[]args) {
		// Example of an Integer using def
		def rint=1..10
		
		//contains()
		println(rint.contains(2))
		println(rint.contains(11))
		
		//get()
		println(rint.get(7))
		println(rint.get(9))
		
		//getFrom and getTo()
		println(rint.getFrom())
		println(rint.getTo())
		
		//size()
		println(rint.size())
	}
}

