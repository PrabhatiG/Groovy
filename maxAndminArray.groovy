package firstprogram

class maxAndminArray {
	static main(args) {
		def numbers=[32,44,12,9,100,180]
		println numbers.max()
		println numbers.min()
		
		 def birds=["Parrot","Cockatiel","Pigeon","Eagle"]
		 
		 println birds.max{it.size()}
		 println birds.min{it.size()}
		
	}
	
}
