public class MyString implements CharSequence {
    private char[] data;
    public MyString(CharSequence s) {
        data = new char[s.length()];
	for(int i = 0; i < data.length; i++) {
	    data[i] = s.charAt(i);
	}
    }
    public char charAt(int index) {
	//exception: IndexOutOfBounds for index less than zero or more than length-1
	if (index < 0 || index > data.length-1) {
	    throw new IndexOutOfBoundsException("Your index cannot be below 0 or longer than the amount of characters in your MyString");
	}
	return data[index];
    }
    public int length() {
	return data.length;
    }
    public CharSequence subSequence(int start, int end) {
	//exception: IndexOutOfBounds for start less than zero or end is more than length-1 or end is less than zero or start is larger than end
	if (start < 0 || end < 0 || end > data.length-1 || start > end) {
	    throw new IndexOutOfBoundsException("Your index cannot be below 0 or longer than the amount of characters in your MyString");
	}
	//loop through data to add each individual char to the string
	//System.out.print(sub) should be result in a string output format
	String sub = "";
	for (int i = start; i < end; i++) {
		sub += data[i];
	}
	return sub + "";
    }
    public String toString() {
	//output format should be like a string output format
	String output = "";
	for (int i = 0; i < data.length; i++) {
		output += data[i];
	}
	return output;
    }
    // public CharSequence compareTo(CharSequence a) {
    // 	//code
    // }
}
    
