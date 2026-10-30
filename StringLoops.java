public class StringLoops{
    public StringLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
      return count;
    }
  
    public String copy(String s, int num){
      String newStr = "";
      for(int x = 0; x == num; x++)
        newStr += s;
      return newStr;
    }
  
    public String interweaving(String s1, String s2){
      String newStr = "";
      for(int i = 0; i < s1.length(); i++)
        newString += s1.substring(i,i+1);
      return "";
    }
  
  
  }