/**
 * ...
 * @author Franco Ponticelli
 */

package thx;

import utest.Assert;
import thx.ERegs;

class TestERegs
{
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testEscape()
  {
  	for (i in 0...x){
    Assert.equals("a\\.b", ERegs.escape("a.b"));
    Assert.equals("a\\.b\\.c", ERegs.escape("a.b.c"));
    Assert.equals("\\(\\[\\.\\]\\.\\)", ERegs.escape("([.].)"));
  }}
}