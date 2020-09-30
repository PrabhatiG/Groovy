package firstprogram

class Arrays {
	static main(args) {
		def birds=["Parrot","Cockatiel","Pigeon"]
		
		println birds[0]
		println birds[2]
		println birds.getAt(1)
		
		println birds[-1]
		println birds[-3]
		println birds[4]
	}
}
