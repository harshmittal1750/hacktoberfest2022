import java.util.Scanner;

import java.util.*;
public class Anagaram_with_substring {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String s4 = "";
       
        String s1 = sc.nextLine();
        int rotation = sc.nextInt();
        sc.nextLine();
       
        String[] s2 = new String[rotation];
        for(int i=0;i<rotation;i++){
            s2[i] = sc.nextLine();
            
            String[] s3 = s2[i].split(" ");
            
            if(s3[0].equals("L")){
               
                s1 = s1.substring(Integer.parseInt(s3[1])) + s1.substring(0,Integer.parseInt(s3[1]));
            }
            else{
               
                s1 = s1.substring(s1.length()-Integer.parseInt(s3[1])) + s1.substring(0,s1.length()-Integer.parseInt(s3[1]));
            }
         
            s4 = s4+s1.charAt(0);

            
        }
        
        int count = 0;
        for(int i=0;i<s1.length();i++){
            
            String s5 = s1.substring(i);
            if(s5.length()>=s4.length()){
            
                if(isAnagram(s5.substring(0,s4.length()),s4)){
                    System.out.println("YES");
                    count++;
                    break;
                }
                
                
            }
        }
        if(count == 0){
            System.out.println("NO");
        }
        
        sc.close();
       
    }
    static boolean isAnagram(String s1, String s2) 
    { 
     
        int n1 = s1.length(); 
        int n2 = s2.length(); 
  
      
        if (n1 != n2) 
            return false; 
  
     
        char[] ch1 = s1.toCharArray(); 
        char[] ch2 = s2.toCharArray(); 
        Arrays.sort(ch1); 
        Arrays.sort(ch2); 
  
        
        for (int i = 0; i < n1; i++) 
            if (ch1[i] != ch2[i]) 
                return false; 
  
        return true; 
    }

}
