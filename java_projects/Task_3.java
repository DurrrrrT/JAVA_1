package java_projects;

// Учитывая входную строку s, измените порядок слов на противоположный .

import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
    String s = "a good   example";
    ArrayList<String>a= new ArrayList<String>();
        int n=s.length();
        String ch="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' ')
                ch=ch+s.charAt(i);
            else{
                if(ch!=""){
                    a.add(ch);
                    ch="";}
            }
            if(i==n-1)
            {
                if(ch!="")
                    a.add(ch);
            }
        }
        int k=a.size();
        String p="";
        for(int i=k-1;i>=0;i--)
        {
            p=p+a.get(i);
            if(i!=0)
            p=p+" ";
        }
        System.out.println(p); 
}
}
