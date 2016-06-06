/**
 * @author Franco Ponticelli
 */

package thx;

import utest.Assert;
using thx.Iterators;
using thx.Functions;

class TestIterators {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testEquals() {
    for (i in 0...x){
    var a = [1,2,3],
        b = [1,2],
        c = [1,2,4];

    Assert.isTrue(a.iterator().equals(a.iterator()));
    Assert.isFalse(a.iterator().equals(b.iterator()));
    Assert.isFalse(a.iterator().equals(c.iterator()));
  }}

  public function testReduce() {
    for (i in 0...x){
    var a = [2, 3, 5, 7];
    Assert.equals(17, a.iterator().reduce(function(a, b) return a + b, 0));
  }}
}
