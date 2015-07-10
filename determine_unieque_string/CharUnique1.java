import java.util.*;

public class CharUnique{

	public static void main(String[] args){

		String str = "bhcdrgav";
		CharUnique uc = new CharUnique();
		boolean result = uc.checkUnique(str);
		if(result)
			System.out.println("String has all unique characters");
		else
			System.out.println("String does not have all unique characters");
	}

	public boolean checkUnique(String str){

		HashSet hashSet = new HashSet(str.length());

		for(char c : str.toCharArray()){ //iterate through character array
			if(!hashSet.add(Character.toUpperCase(c)))//try to add each char to hashset
				return false; //return false if could not add
		}
		return true;
	}
}
