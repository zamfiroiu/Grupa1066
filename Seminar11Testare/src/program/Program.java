package program;

import junit.framework.TestSuite;
import junit.textui.TestRunner;
import testing.PersoanaTestJunit3;

public class Program {

	public static void main(String[] args) {
		TestSuite suita=new TestSuite();
		suita.addTest(new PersoanaTestJunit3("testCheckCNP"));
		TestRunner.run(suita);

	}

}
