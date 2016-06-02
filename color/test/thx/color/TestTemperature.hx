package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;

class TestTemperature extends NanoTestCase{
 

  public function testBasics() {
    var t = new Temperature(5000);
    assertEquals(5000, t.kelvin);
  }

  public function testStrings() {
    var t = new Temperature(5000);
    assertEquals("temperature(5000)", t.toString());
  }

  public function testFromString() {
    assertTrue(new Temperature(5000).equals("temperature(5000)"));
  }
}
