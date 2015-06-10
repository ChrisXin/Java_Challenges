public static boolean isUniqueChars2(String str) {
  
  // create an array of boolean values
  boolean[] char_set = new boolean[256];
  
  // iterate through the string
   for (int i = 0; i < str.length(); i++) {
    
    // check whether i-th character is in this string, store the integer (1 or 0) in val.  (this is O(1))
    int val = str.charAt(i);
    
    if (char_set[val]) return false;
      char_set[val] = true;
      }
      
    // jump out and the string contains unique characters
    return true;
 }
