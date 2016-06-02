package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;

class TestLCh extends NanoTestCase{
 

  public function testBasics() {
    var color = LCh.create(0.5, 0.4, -10).normalize();
    assertEquals(0.5, color.lightness);
    assertEquals(0.4,  color.chroma);
    assertEquals(350, color.hue);
  }

  public function testString() {
    var color = LCh.create(0.5, 0.4, -10).normalize();
    assertEquals("lch(0.5,0.4,350)", color.toString());
  }

  public function testParse() {
    var color : LCh = "cielch(100,10,-10)";
    assertEquals("lch(100,10,-10)", color.toString());
  }

  public function testFromFloat() {
    var s : LCh = "cielch(100,10,-10)",
        f : LCh = [100.0,10.0,-10.0];
    assertTrue(s == f);
  }
}
