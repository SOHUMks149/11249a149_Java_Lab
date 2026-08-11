public class StringFunctionsDemo{
    public static void main(String[] args){
            String str1="Java programming";
            String str2="java programming";
            String str3="Welecome to Java";
            System.out.println("Original string:" +str1);
            System.out.println("Length: "+str1.length());
            System.out.println("Character at index 5:"+str1.charAt(5));
            System.out.println("Substring(5):"+str1.substring(5));
            System.out.println("Substrings(5,11):"+str1.substring(5,11));
            System.out.println("Concatenation :"+str1.concat(" language"));
            System.out.println("Equals:"+str1.equals(str2));
            System.out.println("Equals Ignore Case"+str1.equalsIgnoreCase(str2));
            System.out.println("Compare To:"+str1.compareTo(str2));
            System.out.println("Compare To Ignore cAse:"+str1.compareToIgnoreCase(str2));
            System.out.println("Contains 'Java':"+str1.contains("Java"));
            System.out.println("Starts With 'Java':"+str1.startsWith("Java"));
            System.out.println("Ends with ;'ming':"+str1.endsWith("ming"));
            System.out.println("Index of'P':"+str1.indexOf('P'));
            System.out.println("Last index of 'a':"+str1.lastIndexOf('a'));
            System.out.println("Replace Java with Python:"+str1.replace("Java","Python"));
            System.out.println("Replace all vowels:"+str1.replaceAll("[AEIOUaeiou]","*"));
            System.out.println("Upper case:"+str1.toUpperCase());
            System.out.println("Lower case:"+str1.toLowerCase());
            System.out.println("Trim:"+str3.trim()+"'");
            String str4="";
            System.out.println("Is Empty:"+str4.isEmpty());
            String[] words = str1.split(" ");
System.out.println("Split:");
for(String word : words){
    System.out.println(word);
}

// valueOf()
int num = 100;
String s = String.valueOf(num);
System.out.println("ValueOf(): " + s);

char[] ch = str1.toCharArray();
System.out.println("Character Array:");
for(char c : ch){
    System.out.print(c + " ");
}
System.out.println();
 }
}
