public class MyString implements CharSequence, Comparable<CharSequence> {
    private char[] data;
    public MyString(CharSequence s) {
        data = new char[s.length()];
	for(int i = 0; i < data.length; i++) {
	    data[i] = s.charAt(i);
	}
    }
    public char charAt(int index) {
	//exception: IndexOutOfBounds
	return data[index];
    }
    public int length() {
	return data.length;
    }
    public CharSequence subSequence(int start, int end) {
	//exception: IndexOutOfBounds
	String sub = "";
	for (int i = 0; i < data.length; i++) {
	    sub += data[i];
	}
	return sub;
    }
    public String toString() {
	String output = "";
	for (int i = 0; i < data.length; i++) {
	    output
    }
}
    
