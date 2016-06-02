package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;

class TestYxy extends NanoTestCase{
 

  public function testBasics() {
    var color = Yxy.create(0.5, 0.4, 0.3);
    assertEquals(0.5, color.y1);
    assertEquals(0.4, color.x);
    assertEquals(0.3, color.y2);
  }

  public function testString() {
    var color = Yxy.create(0.5, 0.4, 0.3);
    assertEquals("yxy(0.5,0.4,0.3)", color.toString());
  }

  public function testParse() {
    var color : Yxy = "yxy(0.5,0.4,0.3)";
    assertEquals("yxy(0.5,0.4,0.3)", color.toString());
  }

  public function testFromFloat() {
    var s : Yxy = "yxy(0.5,0.4,0.3)",
        f : Yxy = [0.5,0.4,0.3];
    assertTrue(s == f);
  }
}
