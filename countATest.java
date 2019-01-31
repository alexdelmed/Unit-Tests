package testing;

import static org.junit.Assert.*;

public class countATest{
  @Test
  public void test(){
    JunitTesting test = new JunitTesting();
    int output = test.countA("Alligator");  // word
    assertEquals(2, output); what you expect that comes out.
  }
}
