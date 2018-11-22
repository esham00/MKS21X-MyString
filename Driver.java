public class Driver {
    public static void main (String[] args) {
	MyString a = new MyString("helL o") ;
	MyString b = new MyString("new");
	MyString c = new MyString("c");
	MyString d = new MyString("hahaha");
	MyString e = new MyString("HAHAHA");
	MyString f = new MyString("nen");
       	System.out.println(a);
	System.out.println(c);
	System.out.println(a.charAt(3));
	try {
	    System.out.println(a.charAt(-1));
	}catch (IndexOutOfBoundsException E) {
	    E.printStackTrace();
	}
	try {
	    System.out.println(a.charAt(14));
	}catch(IndexOutOfBoundsException E) {
	    E.printStackTrace();
	}
	System.out.println(a.subSequence(0,2));
	System.out.println(b.compareTo("wen"));
	System.out.println(b.compareTo(f));
	System.out.println(c.compareTo(b));
    }
}
