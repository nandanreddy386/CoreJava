package com.example1;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class May07_task {

	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("4854895754759798568869865656958");
		BigInteger b2 = new BigInteger("5858588943874937497397943");
		
		System.out.println("big integer addition is : "+ b1.add(b2));
		System.out.println("big integer subtraction is : "+b1.subtract(b2));
		System.out.println("big integer multiply is : "+ b1.multiply(b2));
		System.out.println("big integer division is : "+ b1.divide(b2));
		System.out.println("big integer modulus is  : "+ b1.mod(b2));
		System.out.println("******************************************************");
		
		BigDecimal bd1 = new BigDecimal("3945749457875864878738374583683458733489875493798.3497594754");
		BigDecimal bd2 = new BigDecimal("479753923797945392749233475937943953797.3475394759302");
		System.out.println("big decimal addition is : "+ bd1.add(bd2));
		System.out.println("big decimal subtraction is : "+ bd1.subtract(bd2));
		System.out.println("big decimal multiply is : "+ bd1.multiply(bd2));
		System.out.println("big decimal division is : "+(bd1.divide(bd2,10,RoundingMode.HALF_UP)));
		System.out.println("big decimal modulus is : "+ bd1.remainder(bd2));
		
		
		

	}

}
