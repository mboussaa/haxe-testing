
package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;

class TestCmyk extends NanoTestCase{


  public function testBasics() {
    var cmyk = Cmyk.create(0.1, 0.2, 0.3, 0.4);
    assertEquals(0.1, cmyk.cyan);
    assertEquals(0.2, cmyk.magenta);
    assertEquals(0.3, cmyk.yellow);
    assertEquals(0.4, cmyk.black);
  }

  public function testStrings() {
    var cmyk = Cmyk.create(0,1,1,0);
    assertEquals("cmyk(0,1,1,0)", cmyk.toString());
  }

  public function testWhite() {
    assertTrue(thx.color.palettes.Web.white.toCmyk().equals(Cmyk.create(0,0,0,0)));
  }

  public function testFromString() {
    assertTrue(Cmyk.create(0.5, 0.2, 0.1, 0.3).equals("cmyk(50%,0.2,10%,0.3)"));
  }
}
