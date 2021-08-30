public dNode removeValue(int vfr) {
	dNode toRemove = start;
	if(start == null || start.next == null) {
		start = null;
		return toRemove;
	}
	while(toRemove.next != null) {
		toRemove = toRemove.next;
	}
	return toRemove.previus.next = null;
	
	
}
  public boolean removeLast() {
		return false;
  	
  }
}
