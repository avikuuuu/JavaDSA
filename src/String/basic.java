package String;

import java.util.Locale;

public class basic {
    public static void main(String[] args) {



        String name="Ram";
        String name2="   RAm   ";
        String name1=new String("Ram");

//        both are different
        // in  == comparison they check value if they had primitive data type
        // otherwise if comparison is between objects so it will check the local of object
        if(name==name1){
            System.out.println("same");
        }else {
            System.out.println("diff");
        }


        System.out.println(name.equals(name1));  //it checks value of reference object whether it store

        System.out.println(name.equalsIgnoreCase(name2));

        /*
            1. toUpperCase()
            2. toLowerCase()
            3. trim()
            4. startsWith()
            5. endsWith()
            6. equals()
            7. equalslgnoreCase()
            8. charAt()
            9. valueOf()
            6. replace()
            7. contains()
            8. substring()
            9. split()
            10. toCharArray()
            11. isEmpty()
        * */


        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name2.length());
        System.out.println(name2.trim());
        System.out.println(name2.length());
        Integer er=123244;
        //  it uses to convert int boolean value into String type by using Valueof()
        String str=String.valueOf(er);

        if(er instanceof Integer){
            System.out.println("yes int");
        }

        if(str instanceof String){
            System.out.println("yes it is instance of STring object");
        }
        System.out.println(str);
        // it tell the datatype of primitive datatype
        System.out.println(((Object)er).getClass().getName());
        // it use to tell the datatype of object things
        System.out.println(str.getClass().getName());



        //STRING bUFFER
        StringBuffer sb=new StringBuffer(); // creates an empty string buffer with an initial capacity of 16.
        System.out.println("Capacity :"+ sb.capacity());
        sb.append("hello"); // add any character and char in string
        sb.insert(2,"hehe");  //insert at index of string
        sb.replace(3,5,"rep"); //replace string from particular part
        sb.append(" ");
        sb.append("world String Buffer");
        System.out.println(sb);
        System.out.println(((Object) sb).getClass().getName());
        String SBstring=sb.toString();
        System.out.println(SBstring);
        System.out.println(((Object) SBstring).getClass().getName());
    }
}
