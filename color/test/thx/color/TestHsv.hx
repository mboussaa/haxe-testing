package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.Hsva;

class TestHsv extends NanoTestCase{
 

  public function testBasics() {
    var hsv = Hsv.create(1, 0, 0);
    assertEquals(1, hsv.hue);
    assertEquals(0, hsv.saturation);
    assertEquals(0, hsv.value);
  }

  public function testHsb() {
    var hsb = Hsb.create(1, 0, 0);
    assertEquals(1, hsb.hue);
    assertEquals(0, hsb.saturation);
    assertEquals(0, hsb.value);
  }

  public function testStrings() {
    var hsv = Hsv.create(0, 0, 1);
    assertEquals("hsv(0,0%,100%)", hsv.toString());
  }

  public function testFromString() {
    assertTrue(Hsv.create(0.5, 0.2, 0.1).equals("hsv(50%,0.2,10%)"));
    assertTrue(Hsva.create(0.5, 0.2, 0.1, 0.3).equals("hsva(50%,0.2,10%,0.3)"));
  }
}
