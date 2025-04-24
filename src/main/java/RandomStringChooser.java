import java.util.*;
private String [] ss; 
private int valuesRemaining; 
public class RandomStringChooser
{
  RandomStringChooser(String [] s){
    
for(int i=0;i<s.length;i++){
ss[i]=s[i];
}
valuesRemaining=s.length; 
  }
public string getNext(){
if(valuesRemaining==0)
  return "NONE";
int random= (int) (Math.random() * valuesRemaining);
String selected= ss[random];
values[random]= values[valuesRemaining-1]; //need to understand this line of code 
valuesRemaining--; 
  return selected; 
  
}
}
