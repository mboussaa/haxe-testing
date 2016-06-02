package thx.color;

import nanotest.NanoTestCase;
import nanotest.NanoTestRunner;
import thx.color.Rgbxa;

class TestRgbx extends NanoTestCase{
 

  public function testBasics() {
    var red = Rgbx.create(1, 0, 0);
    assertEquals(0xFF, red.red);
    assertEquals(0x00, red.green);
    assertEquals(0x00, red.blue);
  }

  public function testStrings() {
    var color = Rgbx.create(0, 0, 1);
    assertEquals("rgb(0%,0%,100%)", color.toCss3());
    assertEquals("#0000FF", color.toHex());
    assertEquals("rgb(0%,0%,100%)", color.toString());
  }

  public function testFromString() {
    assertTrue(Rgbx.create(0,1,0).equals("#00ff00"));
    assertTrue(Rgbx.create(0,1,0).equals("#0f0"));
    assertTrue(Rgbx.create(0,1,0).equals("rgb(0,100%,0)"));
    assertTrue(Rgbx.create(0,1,0).equals("rgb(0,255,0)"));
    assertTrue(Rgbxa.create(0,1,0,1).equals("#ff00ff00"));
    assertTrue(Rgbxa.create(0,1,0,1).equals("#f0f0"));
    assertTrue(Rgbxa.create(0,1,0,0.5).equals("rgba(0,255,0,50%)"));
    assertTrue(Rgbxa.create(0,1,0,0.5).equals("rgba(0,100%,0,0.5)"));
  }
}