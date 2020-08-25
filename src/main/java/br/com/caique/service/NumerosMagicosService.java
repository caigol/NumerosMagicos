package br.com.caique.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.caique.exception.FirstNumberHigherException;
import br.com.caique.exception.NoPrimeNumbersFoundException;
import br.com.caique.exception.NotPositiveNumbersException;

@Service
public class NumerosMagicosService {
	
	public void isHigher(int numberOne, int numberTwo) {
		if(numberOne > numberTwo)
			throw new FirstNumberHigherException("The first number cannot be greater than the second");
	}
	
	public void isPositive(int numberOne, int numberTwo) {
		if(numberOne < 0 || numberTwo < 0)
			throw new NotPositiveNumbersException("The numbers not positives");
	}
	
	public boolean isPrime(int number) {
			for (int j = 2; j < number; j++) {
		        if (!(number%j==0))
		        	return true;
		     }
			 return false;
	}
	
	public int showMagicNumbers(int numberOne, int numberTwo) {
		isPositive(numberOne, numberTwo);
		isHigher(numberOne, numberTwo);
		List<Integer> listaNumeros = new ArrayList<Integer>();
		for(int i = numberOne; i <= numberTwo; i++) {
			listaNumeros.add(i);
		}
		int magicNumber = 0; 
		for(int i = 0; i < listaNumeros.size(); i++) {
			boolean isPrime = isPrime((int)Math.sqrt(listaNumeros.get(i)));
			if(isPrime) {
				magicNumber++;
			}
		 }
		if(magicNumber == 0)
			throw new NoPrimeNumbersFoundException("No magic numbers found");
		return magicNumber;
	}

}
