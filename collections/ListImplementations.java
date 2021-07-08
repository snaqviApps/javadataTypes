package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImplementations {

   public static void main(String[] args){

       List<String> strList = new ArrayList<>();
       List strGen = new ArrayList();
       strList.add("hh");
       strList.add("22");

       strGen.add(2);
       strGen.add("hi general");

       System.out.println("general-list class-type: " + strGen.getClass());
       strGen.forEach(i ->{
                   System.out.println("using forEach(): getting data-type: " + i.getClass());
                   System.out.println("using forEach(): getting data: " + i);
               });

       System.out.println("================");
       Iterator<String> strItr = strList.iterator();
       while(strItr.hasNext()){
           String str = strItr.next();
           System.out.println("print 'strItr' using Iterator interface: " + str);
       }

   }

}
