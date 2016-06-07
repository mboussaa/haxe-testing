package thx.culture;

import utest.Assert;
import thx.culture.Culture;

class TestCulture {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInvariant() {
    for (i in 0...x){
    Assert.isFalse(Culture.invariant.isNeutral);
    Assert.isFalse(Culture.invariant.isRightToLeft);
    Assert.equals("", Culture.invariant.code);
    Assert.equals("iv", Culture.invariant.iso2);
    Assert.equals("IVL", Culture.invariant.iso3);
    Assert.equals("Invariant Language", Culture.invariant.nameEnglish);
    Assert.equals("Invariant Language", Culture.invariant.nameNative);
  }}
}