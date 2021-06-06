package test03;

import java.util.ArrayList;

public class sol06 {
	public int solution(int n) {
		int answer = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i <= n; i += 2) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++)
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			if (isPrime)
				primes.add(i);
		}

		int primeLen = primes.size();
		for (int i = 0; i < primeLen - 2; i++)
			for (int j = i + 1; j < primeLen - 1; j++)
				for (int k = j + 1; k < primeLen; k++)
					// 합이 되면, 맞는거자나.
					if (primes.get(i) + primes.get(j) + primes.get(k) == n)
						answer++;
		return answer;
	}

}
