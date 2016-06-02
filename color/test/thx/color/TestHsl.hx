package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.Hsla;

class TestHsl  extends NanoTestCase{
 

  public function testBasics() {
    var hsl = Hsl.create(1, 0, 0);
    assertEquals(1, hsl.hue);
    assertEquals(0, hsl.saturation);
    assertEquals(0, hsl.lightness);
  }

  public function testStrings() {
    var hsl = Hsl.create(0, 0, 1);
    assertEquals("hsl(0,0%,100%)", hsl.toString());
    assertEquals("hsl(0,0%,100%)", hsl.toCss3());
  }

  public function testFromString() {
    assertTrue(Hsl.create(0.5, 0.2, 0.1).equals("hsl(50%,0.2,10%)"));
    assertTrue(Hsla.create(0.5, 0.2, 0.1, 0.3).equals("hsla(50%,0.2,10%,0.3)"));
  }
}
