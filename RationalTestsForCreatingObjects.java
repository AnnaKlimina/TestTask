import org.junit.Test;
import static org.junit.Assert.*;

public class RationalTestsForCreatingObjects {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }
	
	
	@Test
	public void testConstructorWithParametres(){
		Rational object = new Rational(1,3);
		assertEquals("Constructor with parameters returns wrong numerator", 1, object.getNumerator());
		assertEquals("Constructor with parameters returns wrong denominator", 3, object.getDenominator());	
	}
	
	@Test
	public void testReduceFunction(){
		Rational object = new Rational(5,10);
		assertTrue("Method 'reduce' returns wrong numerator", 1==object.getNumerator());
		assertTrue("Method 'reduce' returns wrong denominator", 2==object.getDenominator());
	} 
	
	@Test
	public void testSimplifyMinuses(){
		Rational object = new Rational(4,-7);
		assertEquals("'simplifyMinuses' returns wrong sign of numerator",-4,object.getNumerator());
		assertEquals("'simplifyMinuses' returns wrong sign of denominator",7,object.getDenominator());		
	}
	
	@Test 
	public void testConstructorZeroDenominator(){
		try{
			Rational object = new Rational(1,0);
		}
		catch(Exception mes){
			assertNotEquals("Constructor with parameters let denominator be zero",mes,null);
		}
	}
	
	@Test
	public void testSetNumeratorAndSetDenominator(){
		Rational object = new Rational(1,3);
		object.setNumerator(2);
		object.setDenominator(5);
		assertEquals("Method 'setNumerator' returns wrong numerator", 2, object.getNumerator());
		assertEquals("Method 'setDenominator' returns wrong denominator", 5, object.getDenominator());
		object.setDenominator(0);
		assertFalse("Method 'setDenominator' let denominator be zero",0==object.getDenominator());
	}

	@Test
	public void  testStringViewRational(){
		Rational object = new Rational(1,3);
		assertEquals("Method 'toString' returns false result","1/3",object.toString());
	}
}