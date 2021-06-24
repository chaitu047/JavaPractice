package javatpoint;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MissingBraces {

	public static boolean checkMissingBraces(String text) {
		Deque<Character> stack = new ArrayDeque<Character>();

		List<Character> openList = new ArrayList<Character>();
		openList.add('{');
		openList.add('[');
		openList.add('(');

		List<Character> checkList = new ArrayList<Character>();
		checkList.add('}');
		checkList.add(']');
		checkList.add(')');
		
		List<Character> compList = new ArrayList<Character>();
		compList.addAll(openList);
		compList.addAll(checkList);

		for (int i = 0; i < text.length(); i++) {
			Character ch = text.charAt(i);
			
			if (compList.contains(ch)==false) {
				continue;
			}

			if (openList.contains(ch)) {
				stack.push(ch);
				continue;
			}
			
			char sh = stack.pop();
			
			switch (ch) {
			case '}':
				if (sh != '{') {
					return false;
				}
				break;
			case ')':
				if (sh != '(') {
					return false;
				}
				break;

			case ']':
				if (sh != '[') {
					return false;
				}
				break;
			default:
				return false;

			}
		}
		
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "(abc[{gdfgsfghfd}sfgh]setdr;y)";
		
		System.out.println(checkMissingBraces(text));
	}

}
