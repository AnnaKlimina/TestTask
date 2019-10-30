import org.junit.Test;
import static org.junit.Assert.*;

public class RationalTestsForFunctionality{
	@Test
	public void testEqualsDifferentClassesOrNull(){
		Rational object = new Rational(7,1);
		String str = "example";
		assertFalse("Method 'equals' returns wrong result",object.equals(7));
		assertFalse("Method 'equals' returns wrong result for different classes",object.equals(str));
		assertFalse("Method 'equals' returns wrong result for null",object.equals(null));
	}
	
	@Test
	public void testEqualsRationals(){
		Rational object1 = new Rational(1,3);
		assertTrue("Method 'equals' returns wrong result for equal Rational objects",object1.equals(new Rational(2,6)));
		assertFalse("Method 'equals' returns wrong result for different Rational objects",object1.equals(new Rational(7,5)));
	}
	
	@Test
	public void testLess(){
		Rational object1 = new Rational(1,3);
		assertTrue("Method 'less' returns wrong result for Rational objects with equal denominators", object1.less(new Rational(4,3)));
		assertTrue("Method 'less' returns wrong result for Rational objects with equal numerators", object1.less(new Rational(1,2)));
		assertTrue("Method 'less' returns wrong result for Rational objects with different denominators", object1.less(new Rational(5,6)));
	}
	
	@Test
	public void testPlus(){
		Rational object1 = new Rational(1,3);
		Rational object2 = new Rational(5,9);
		object1 = object1.plus(object2);
		assertEquals("Method 'plus' returns wrong result", object1.getDenominator(),9);
		assertEquals("Method 'plus' returns wrong result", object1.getNumerator(),8);		
	}
	
	@Test
	public void testMinus(){
		Rational object1 = new Rational(4,7);
		object1 = object1.minus(new Rational(2,3));
		assertEquals("Method 'minus' returns wrong result", object1.getDenominator(),21);
		assertEquals("Method 'minus' returns wrong result", object1.getNumerator(),-2);		
	}
	
	@Test
	public void testMultiply(){
		Rational object1 = new Rational(1,3);
		Rational object2 = new Rational(9,5);
		object1 = object1.multiply(object2);
		assertEquals("Method 'multiply' returns wrong result", object1.getDenominator(),5);
		assertEquals("Method 'multiply' returns wrong result", object1.getNumerator(),3);
	}
	
	@Test
	public void testDivide(){
		Rational object = new Rational(1,2);
		Rational object1 = new Rational(5,6);
		object1 = object1.divide(object);
		assertEquals("Method 'divide' returns wrong result(denominator)", object1.getDenominator(),3);
		assertEquals("Method 'divide' returns wrong result(numerator)", object1.getNumerator(),5);
		try{
			object = object.divide(new Rational(0,1));
		}
		catch(Exception mes){
			assertNotEquals("Method 'divide' uses zero as divider",mes,null);		
		}
	}
	
	
}
