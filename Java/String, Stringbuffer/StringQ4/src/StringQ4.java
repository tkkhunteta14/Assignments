
public class StringQ4 {

	 public static void main(String[] args)
	 {
	 StringBuffer s = new StringBuffer("");
	 System.out.println(s);
	 s.append("StringBuffer");
	 s.append(" Is a peer class of String");
	 s.append(" That provides much of");
	 s.append(" The functionality of strings");
	 System.out.println(s);
   StringBuffer str= new StringBuffer("It is used to  at the specified index position");
   str.insert(14,"insert text");
   System.out.println(str);
   StringBuffer strnew= new StringBuffer("This method returns the reversed object on which it was called");
   System.out.println(strnew);
   strnew.reverse();
   System.out.println(strnew);
   }
}
