public class string1 {
      public static void main(String [] args){
          System.out.println("Shaheer".substring(0,4));
          String newWord = new String("Hello");
          System.out.println("newWord:"+newWord);
//
          byte[] byteList = {1,2,3,4,5,};
          String byteWord = new String(byteList);
          System.out.println("byteWord:" + byteWord);
//
          String s = "Strings are immutable";
          char result = s.charAt(8);
          System.out.println("charAT:" + result);
//
          String s1 = "Learning Strings";
          String s2 = " is Fun";
          //using inbuilt function
          String concat = s1.concat(s2);
          System.out.println("concat:" +concat);
//
          Integer x = 5;
          Integer y = 10;
          System.out.println("equals:"+ x.equals(y));
//
          String Str1 = new String("This is really not immutable!!");
          String Str2 = Str1;
          String Str3 = new String("This is really not immutable!!");
          String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
          boolean retVal;

          retVal = Str1.equals( Str2 );
          System.out.println("Returned Value = " + retVal );
 //
          String Str = new String("MY NAME IS SHAHEER MALIK");

          System.out.print("lower case :");
          System.out.println(Str.toLowerCase());
//
          String S = new String("my name is shaheer malik");

          System.out.print("upper case :");
          System.out.println(S.toUpperCase());
//

          String r = new String("my phone");
//
          System.out.print("replace oldChar,newChar:" );
          System.out.println(r.replace('p', 'D'));
//

          String T = new String("                                                      Shaheer Malik  ");

          System.out.print("trim:" );
          System.out.println(T.trim() );
//
          String L = new String("Shaheer");
          System.out.print("indexOf(a_string):" );
          System.out.println(L.indexOf( 'e' ));
//
          String o = new String("Shaheer");
          System.out.print("lastIndexOf :" );
          System.out.println(o.lastIndexOf( 'e' ));

           System.out.println();
          String name1= new String("Shaheer Malik");
          StringBuffer name2 = new StringBuffer("ali");
          StringBuilder name3 = new StringBuilder("hamid");

          System.out.println("name3 value before change " + name1);
          name1 = name1.replace("j" , "A");
          System.out.println("name1 value before change " + name1);
          System.out.println(name2);
          System.out.println("name2 value before change " + name1);
          System.out.println(name3);
      }

}
