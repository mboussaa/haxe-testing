package thx.culture;

import utest.Assert;
import thx.culture.Pattern;

class TestNumberFormatInfo {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInvariant() {
    for (i in 0...x){
    var n = NumberFormatInfo.invariant;

    Assert.same([3], n.groupSizesNumber);
    Assert.equals('.', n.separatorDecimalNumber);
    Assert.equals(',', n.separatorGroupNumber);
    Assert.equals('-', n.signNegative);
    Assert.equals('+', n.signPositive);
    Assert.equals('NaN', n.symbolNaN);
  }}
}