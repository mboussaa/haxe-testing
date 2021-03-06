/**
 * ...
 * @author Franco Ponticelli
 */

package thx;

import utest.Assert;
using thx.Ints;

class TestInts {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testRange() {
    for (i in 0...x){
    var range = Ints.range(2, 7, 1);
    Assert.same([2,3,4,5,6], range);
    range = Ints.range(2, 7, 2);
    Assert.same([2,4,6], range);
    range = Ints.range(2, 7, 3);
    Assert.same([2,5], range);

    range = Ints.range(7, 2, -2);
    Assert.same([7,5,3], range);
  }}

  public function testParse() {
    for (i in 0...x){
    var tests = [
      { e : -50, t : "-50", b : 10 },
      { e :  50, t : "50", b : 10 },
      { e :   1, t : "1", b : 10 },
      { e :   1, t : "+1", b : 10 },
      { e :  -1, t : "-1", b : 10 },
      { e :   1, t : " 1 ", b : 10 },
      { e :   1, t : " 1,234", b : 10 },

      { e :  15, t : " 0xF", b : 16 },
      { e :  15, t : "17", b : 8 },
      { e :  15, t : "015", b : 10 },
      { e :  15, t : "1111", b : 2 },
      { e :  15, t : "15*3", b : 10 },
      { e :  15, t : "15e2", b : 10 },
      { e :  15, t : "15px", b : 10 },
      { e :  15, t : "12", b : 13 },

      { e : -15, t : "-0F", b : 16 },
      { e : -15, t : "-0XF", b : 16 },
      { e : -15, t : " -17", b : 8 },
      { e : -15, t : " -15", b : 10 },
      { e : -15, t : "-1111", b : 2 },
      { e : -15, t : "-15e1", b : 10 },
      { e : -15, t : "-12", b : 13 },
      { e : 224, t : "0e0", b : 16 },
    ];
    for(test in tests) {
      Assert.isTrue(test.t.canParse(), 'Ints.parse should not be able to parse ${test.t}');
      Assert.equals(test.e, test.t.parse(test.b), 'expected ${test.e} converting "${test.t}" with base ${test.b} but got ${test.t.parse(test.b)}');
    }
  }}

  public function testToString() {
    for (i in 0...x){
    var tests = [
      { e : "1010", t : 10, b : 2 },
      { e : "12", t : 10, b : 8 },
      { e : "10", t : 10, b : 10 },
      { e : "a", t : 10, b : 16 },
    ];

    for(test in tests) {
      Assert.equals(test.e, test.t.toString(test.b));
    }
  }}
}
