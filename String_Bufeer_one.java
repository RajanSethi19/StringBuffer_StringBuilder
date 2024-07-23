package String_Buffer_Builder_Concept;

public class String_Bufeer_one {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rajan");
		 sb.append("Sethi");
		System.out.println(sb);
		
		String s = new String("Rajan");
		 s.concat("Sethi");
		System.out.println(s);
		
		StringBuffer sb1 = new StringBuffer("Rajan Sethi ");
		sb1.insert(5, " Sir");
		System.out.println(sb1);

		StringBuffer sb2 = new StringBuffer("Rajan Sethi ");
		sb2.delete(6, 11);
		System.out.println(sb2);

		StringBuffer sb3 = new StringBuffer("Rajan Sethi");
		sb3.reverse();
		System.out.println(sb3);

	}
}