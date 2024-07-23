package String_Buffer_Builder_Concept;

public class Practice {
public static void main(String[] args) {
	StringBuffer sb= new StringBuffer(20);
	
	sb.ensureCapacity(20);
	sb.append("I live in chandigarh");
	System.out.println(sb.capacity());
	
	/*
	 * System.out.println(sb.capacity()); sb.append("Sethi");
	 * System.out.println(sb.capacity());
	 * sb.append("I System.out.println(sb.capacity());");
	 * System.out.println(sb.capacity()); System.out.println(sb);
	 */
	
}
}
