
public class CalculatorExpression {
	/**
	 * 
	 * @param expression - string contains arithmetic expression, e.g. "10*3/2 + 5" with
	 * four arithmetic operations(/*-+) and natural numbers               (22)
	 *arithmetic operation preferences are not token into consideration
	 *if the given expression contains disallowed symbols the method return 0
	 *in the case of zero division the method should return 0
	 * @return
	 */
	public static int calculate(String expression){
		String values[] = expression.split("\\D+");
		String operators[] = expression.split("\\d+");
		int res = 0;
		int numberOfFirstValue = 0;
		if(values[0].matches("\\d+")){
			res = Integer.parseInt(values[0]);
		}else if(values[0].matches("[ ]*")){
			res = Integer.parseInt(values[1]);
			numberOfFirstValue = 1;
		}else return 0;
		if(!operators[0].matches("[ ]*"))return 0;
		for(int i = 1; i < operators.length; i++){
			int j = numberOfFirstValue + i;
			int flag = res;
			if(operators[i].matches("[ ]*[+][ ]*")) res += Integer.parseInt(values[j]);
			if(operators[i].matches("[ ]*[-][ ]*")) res -= Integer.parseInt(values[j]);
			if(operators[i].matches("[ ]*[*][ ]*")) res *= Integer.parseInt(values[j]);
			if(operators[i].matches("[ ]*[/][ ]*")){
				if(Integer.parseInt(values[j]) == 0)return 0;
				res /= Integer.parseInt(values[j]);
			}
			if(flag == res)return 0;
		}
		return res;
	}
}
