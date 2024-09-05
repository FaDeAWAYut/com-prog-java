public class Deck extends DeQLinkedList {
	
	public int draw() {
		
		try {
			return removeFirst();
		}
		catch (Exception e) {
			return -1;
		}
	}
	
	public int removeNth(int n) {
		if (n>=theList.size) {
			return -1;
		}
		
		DListIterator itr = new DListIterator(theList.header);
		for (int i = -1; i<n; i++) {
			try {
				itr.next();
				}
			catch (Exception e) {
				return -1;
			}

		}
		
		int data = itr.currentNode.data;
		
		try {
			this.theList.removeAt(itr);
		} catch (Exception e) {
			return -1;
		}
		
		return data;
		
	}
	
	public void putBottom(int n) {
		try {
			insertLast(n);
		} catch (Exception e) {
			return;
		}
	}
	
	public void reverseTopN(int n) {
		
		if (n<theList.size) {
			DListIterator itr = new DListIterator(theList.header);
			
			try {
				itr.next();
			}
			catch (Exception e){
				return;
			}
			
			DListIterator itr2 = new DListIterator(theList.header);
			for (int i = 0; i<n; i++) {
				try {
					itr2.next();
					}
				catch (Exception e) {
					return;
				}
			}
			
			
			if (n%2 == 0) {
				for (int i = 0; i<(n/2);i++) {
					int temp1 = itr.currentNode.data;
					int temp2 = itr2.currentNode.data;
					
					itr.currentNode.data = temp2;
					itr2.currentNode.data = temp1;
					
					try {
						itr.next();
						itr2.previous();
					}
					catch (Exception e) {
						return;
					}
				}
			}
			else if (n%2 != 0) {
				for (int i = 0; i<((n-1)/2);i++) {
					int temp1 = itr.currentNode.data;
					int temp2 = itr2.currentNode.data;
					
					itr.currentNode.data = temp2;
					itr2.currentNode.data = temp1;
					
					try {
						itr.next();
						itr2.previous();
					}
					catch (Exception e) {
						return;
					}
				}
			}
		}
		
		
		
		else if (n>=theList.size){
			n = theList.size;
			DListIterator itr = new DListIterator(theList.header);
			
			try {
				itr.next();
			}
			catch (Exception e){
				return;
			}
			
			DListIterator itr2 = new DListIterator(theList.header);
			for (int i = 0; i<n; i++) {
				try {
					itr2.next();
					}
				catch (Exception e) {
					return;
				}
			}
			
			
			if (n%2 == 0) {
				for (int i = 0; i<(n/2);i++) {
					int temp1 = itr.currentNode.data;
					int temp2 = itr2.currentNode.data;
					
					itr.currentNode.data = temp2;
					itr2.currentNode.data = temp1;
					
					try {
						itr.next();
						itr2.previous();
					}
					catch (Exception e) {
						return;
					}
				}
			}
			else if (n%2 != 0) {
				for (int i = 0; i<((n-1)/2);i++) {
					int temp1 = itr.currentNode.data;
					int temp2 = itr2.currentNode.data;
					
					itr.currentNode.data = temp2;
					itr2.currentNode.data = temp1;
					
					try {
						itr.next();
						itr2.previous();
					}
					catch (Exception e) {
						return;
					}
				}
			}
		}
	
		

	}

	
}