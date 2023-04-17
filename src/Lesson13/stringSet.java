package Lesson13;
import java.util.ArrayList;

public class StringSet extends ArrayList {
	
	
	public StringSet() {
		
		
	}
	
	public boolean add(String newStr) {
		return super.add(newStr);
			
	}
	
	public void pop() {
		if(this.size() > 0) {
			this.remove(this.size()-1);
		}
	}
	
	public int sumValidIntegers() {
		int sum = 0;
		for(int i = 0; i < this.size(); i++) {
			try {
                int num = Integer.parseInt((String)this.get(i));
                sum += num;
            } catch (NumberFormatException e) 
			{}
			
		}
        return sum;
	}

	public int numChars() {
        int totalChars = 0;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) != null) {
                totalChars += ((String)this.get(i)).length();
            }
        }
        return totalChars;
    }
	
	public int countStrings(String stringToLookFor) {
		 int count = 0;
		    for (int i = 0; i < this.size(); i++) {
		        if (this.get(i) != null && ((String)this.get(i)).contains(stringToLookFor)) {
		            count++;
		        }
		    }
		    return count; 
	}

}
