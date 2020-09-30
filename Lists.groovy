package firstprogram

class Lists {
	static void main(def args) {
		def list1 =	[11,12,15,25,32]
		def newList=[]
		
		//add(Object value)
		list1.add(16)
		println(list1)
		
		//add(int index, Object value)
		list1.add(2, 20)
		println(list1)
		
		//remove(int index)
		list1.remove(3)
		println(list1)
		
		//plus(Collection collection)
		newList=list1.plus([21,22])
		println(newList)
		
		//minus(Collection collection)
		newList=list1.minus([11,12])
		println(newList)
		
		//size()
		println(list1.size())
		println(newList.size())
		
		//sort()
		println(list1.sort())
		println(newList.sort())
	}
}
