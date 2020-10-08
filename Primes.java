package helloWorld;

public class Primes {
	//TODO: Этот класс выводит простые числа от 1 до 100
	public static void main(String args[]) {
		//TODO: проходим циклом по числам от 1 до 100 и вызываем для каждого isPrime
		for (int i = 2; i<= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i+ ", ");
			}
		}
	}
	public static boolean isPrime(int n) {
		/* Метод служит для определения, простое число или нет.
		 * Для определения, простое число или нет, 
		 * достаточно рассмотреть все множители от 2 до корня из этого числа
		 * Вызываем цикл, проходящий все эти числа. 
		 * Если в какой-то момент обнаруживаем, 
		 * что остаток от деления равен 0, значит число не простое.
		 */
		for (int i=2; i <= (int)(Math.sqrt(n)); i++  ) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
