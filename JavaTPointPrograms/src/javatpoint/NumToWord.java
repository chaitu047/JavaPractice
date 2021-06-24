package javatpoint;

public class NumToWord {

	public static void numberToWord(int num) {
		int pos=1;
		String res = "";
		String temp[] = String.valueOf(num).split("");
		StringBuilder sb = new StringBuilder("1");
		for(int i=0;i<temp.length-1;i++)
		{
			sb.append("0");
		}
		pos = Integer.parseInt(sb.toString());
		for(String i : temp)
		{
			res+=subFunction(pos, Integer.parseInt(i));
			pos/=10;
		}
		
		System.out.println(res);
		
	}

	public static String subFunction(int pos,int digit)
	{
		String res="";
		switch (pos) {
		case 1:
			switch (digit) {
			case 1:
				res += "one ";
				break;

			case 2:
				res += "two ";
				break;

			case 3:
				res += "three ";
				break;
			case 4:
				res += "four ";
				break;

			case 5:
				res += "five ";
				break;

			case 6:
				res += "six ";
				break;

			case 7:
				res += "seven ";
				break;

			case 8:
				res += "eight ";
				break;

			case 9:
				res += "nine";
				break;
			}
			break;
		case 10:
			switch (digit) {
			case 1:
				res += "one ";
				break;

			case 2:
				res += "two ";
				break;

			case 3:
				res += "thirty ";
				break;
			case 4:
				res += "fourty ";
				break;

			case 5:
				res += "fifty ";
				break;

			case 6:
				res += "sixty ";
				break;

			case 7:
				res += "seventy ";
				break;

			case 8:
				res += "eighty ";
				break;

			case 9:
				res += "ninety ";
				break;
			}
			break;
		case 100:
			switch (digit) {
			case 0:
				res += "zero ";
				break;
			
			case 1:
				res += "one ";
				break;

			case 2:
				res += "two ";
				break;

			case 3:
				res += "thirty ";
				break;
			case 4:
				res += "fourty ";
				break;

			case 5:
				res += "fifty ";
				break;

			case 6:
				res += "sixty ";
				break;

			case 7:
				res += "seventy ";
				break;

			case 8:
				res += "eighty ";
				break;

			case 9:
				res += "ninety ";
				break;
			}
			res+="hundred ";
			break;
		case 1000:
			switch (digit) {
			case 0:
				res += "zero ";
				break;
			
			case 1:
				res += "one ";
				break;

			case 2:
				res += "two ";
				break;

			case 3:
				res += "thirty ";
				break;
			case 4:
				res += "fourty ";
				break;

			case 5:
				res += "fifty ";
				break;

			case 6:
				res += "sixty ";
				break;

			case 7:
				res += "seventy ";
				break;

			case 8:
				res += "eighty ";
				break;

			case 9:
				res += "ninety ";
				break;
			}
			res+="thousand ";
			break;
		case 10000:
			switch (digit) {
			case 0:
				res+="zero ";
			
			case 1:
				res += "one ";
				break;

			case 2:
				res += "two ";
				break;

			case 3:
				res += "thirty ";
				break;
			case 4:
				res += "fourty ";
				break;

			case 5:
				res += "fifty ";
				break;

			case 6:
				res += "sixty ";
				break;

			case 7:
				res += "seventy ";
				break;

			case 8:
				res += "eighty ";
				break;

			case 9:
				res += "ninety ";
				break;
			}
			res+="Lakhs ";
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWord(92345);
	}

}
