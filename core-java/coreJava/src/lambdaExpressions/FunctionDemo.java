package lambdaExpressions;

import java.util.function.Function;

public class FunctionDemo
{
	public static void main(String[] args) {
		
		Function<Integer,Integer> squareIt = n->n*n;
		Function<Integer,Integer> doubleIt = n->2*n;
		
		System.out.println(squareIt.andThen(doubleIt).apply(2));// 8
		System.out.println(doubleIt.andThen(squareIt).apply(2));// 16
		
		
	}

}
