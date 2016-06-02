package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;

class TestGrey extends NanoTestCase{
 

  public function testBasics() {
    var grey = new Grey(0.2);
    assertEquals(0.2, grey.grey);
  }

  public function testStrings() {
    var grey = new Grey(0.5);
    assertEquals("grey(50%)", grey.toString());
  }

  public function testFromString() {
    assertTrue(new Grey(0.2).equals("grey(20%)"));
  }
}
