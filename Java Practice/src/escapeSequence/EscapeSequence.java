package escapeSequence;
//						Escape Sequence
//A character preceded by a backslash (\) is an escape sequence and has a special meaning to the compiler.

public class EscapeSequence {

	public static void main(String[] args) {
		System.out.println("\"Hello world\"");//Inserts a double quote character in the text at this point.
		System.out.println("\'Hello world\'");//Inserts a single quote character in the text at this point.
		System.out.println("\\Hello world\\");//Inserts a backslash character in the text at this point.
		System.out.println("\nHello world\nMy world");//Inserts a newline in the text at this point.
		System.out.println("\nHello world\tMy world");//Inserts a tab in the text at this point.
		System.out.println("\nHello world\tMy world");
		System.out.println("\nHello world\fMy world");//Inserts a form feed in the text at this point.
		System.out.println("\nHello world\rMy world");//Inserts a carriage return in the text at this point.
		System.out.println("\nHello world\bd\bMy world");//Inserts a backspace in the text at this point.
	}

}
