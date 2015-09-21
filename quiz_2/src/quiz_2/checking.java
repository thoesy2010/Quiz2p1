package quiz_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class checking {

	@Test
	public void testfv() {
		QuizQ1 tester = new QuizQ1();

		assertEquals("fv of 12520$ with a 10% increase each year for 4 years must be 58105.32", 58105.32,
				QuizQ1.fv(4, 12520, 10), 0.01);
		assertEquals("fv of 12520$ with a 10% increase each year for 1 year1 must be 12520", 12520,
				QuizQ1.fv(1, 12520, 10), 0.01);

		;
	}

	@Test
	public void testPmt() {
		QuizQ1 tester = new QuizQ1();

		assertEquals("pmt of 58105.32% with a 20%APR in 4 years must be 1768.17 ", 1768.17, QuizQ1.pmt(4, 58105.32, 20),
				0.1);
		assertEquals("pmt of 58105.32% with a 10%APR in 1 year1 must be 1130.03 ", 1130.03, QuizQ1.pmt(1, 12520, 15),
				0.1);

	}

}
