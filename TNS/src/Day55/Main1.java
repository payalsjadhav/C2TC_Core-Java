package Day55;

class Main1 {
	  public static void main(String[] args) {

	    // hashCode() with Object
	    Object obj1 = new Object();

	    // assign obj1 to obj2
	    Object obj2 = obj1;

	    // check if two objects are equal
	    System.out.println(obj1.equals(obj2));  // true

	    // get hashcode of obj1 and obj2
	    System.out.println(obj1.hashCode());   // 1785210046
	    System.out.println(obj2.hashCode());   // 1785210046

	  }
	}
