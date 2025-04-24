import java.util.*;

public class RandomStringChooser
{
  private String [] ss; //have to be declared inside the class to be acessed inside the class
private int valuesRemaining; 
  RandomStringChooser(String [] s){
    
for(int i=0;i<s.length;i++){
ss[i]=s[i];
}
valuesRemaining=s.length; 
  }
public String getNext(){
if(valuesRemaining==0)
  return "NONE";
int random= (int) (Math.random() * valuesRemaining);
String selected= ss[random];
ss[random]= ss[valuesRemaining-1]; //need to understand this line of code 
valuesRemaining--; 
  return selected; 
  
}
}
