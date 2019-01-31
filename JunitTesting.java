package testing;

public class JunitTesting{

  public int countA(String word){
    int count = 0;
    for(int i = 0; i < word.lengh(); i++){
      if(word.charAt(i)=='a' || word.charAt(i)=='A'){
        count++;
      }
    }
    return count;
  }
}
