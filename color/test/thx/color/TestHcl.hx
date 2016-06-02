package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.LCh;

class TestHcl extends NanoTestCase{
 

  public function testParse() {
    var hcl = LCh.fromString("hcl(0.5,0,1)");
    assertEquals(0.5, Std.int(hcl.hue));
    assertEquals(0, Std.int(hcl.chroma));
    assertEquals(1, Std.int(hcl.lightness));
  }

  public function testStrings() {
    var hcl = LCh.create(1, 0.5, 0);
    assertEquals("hcl(0,0.5,1)", hcl.toHclString());
  }
}
