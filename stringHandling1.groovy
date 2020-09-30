package firstprogram

class stringHandling1 {
	public static void main(args) {
		println 'ABCDEF'.length()
		println 'ABCDEF'.substring(1)
		println 'ABCDEF'.indexOf('C')
		println 'ABCDEF'.replace('CD','XX')
		println 'ABCDEF'.toLowerCase()
		
		println 'ABC'-'B'
		println 'ABBC'-'B'
		println 'ABBC'-'BB'
		println'ABC'*2
		println 'ABC'*3
		
	}
}
