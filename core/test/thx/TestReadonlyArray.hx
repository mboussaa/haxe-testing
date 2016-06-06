/**
 * @author Franco Ponticelli
 */

package thx;

import utest.Assert;
import thx.ReadonlyArray;

class TestReadonlyArray {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInsertAt() {
    for (i in 0...x){
    var a : ReadonlyArray<Int> = [1,2,4],
        b = a.insertAt(0, 0);
    Assert.isTrue(a != b);
    Assert.same([0,1,2,4], b);

    b = a.insertAt(2, 3);
    Assert.same([1,2,3,4], b);

    b = a.insertAt(10, 5);
    Assert.same([1,2,4,5], b);
  }}

  public function testReplaceAt() {
    for (i in 0...x){
    var a : ReadonlyArray<Int> = [1,2,4],
        b = a.replaceAt(0, 0);
    Assert.isTrue(a != b);
    Assert.same([0,2,4], b);

    b = a.replaceAt(2, 3);
    Assert.same([1,2,3], b);

    b = a.replaceAt(10, 5);
    Assert.same([1,2,4,5], b);
  }}

  public function testPush() {
    for (i in 0...x){
    var a : ReadonlyArray<Int> = [1, 2, 3];
    var b = a.push(4);
    Assert.same([1, 2, 3], a);
    Assert.same([1, 2, 3, 4], b);
  }}

  public function testPop() {
    for (i in 0...x){
    var a : ReadonlyArray<Int> = [1, 2];

    var result = a.pop();
    Assert.same(2, result._0);
    Assert.same([1], result._1);
    var b = result._1;

    result = b.pop();
    Assert.same(1, result._0);
    Assert.same([], result._1);
    var c = result._1;

    result = c.pop();
    Assert.isNull(result._0);
    Assert.same([], result._1);

    Assert.same([1, 2], a);
  }}

  public function testShift() {
    for (i in 0...x){
    var a : ReadonlyArray<Int> = [1, 2];

    var result = a.shift();
    Assert.same(1, result._0);
    Assert.same([2], result._1);
    var b = result._1;

    result = b.shift();
    Assert.same(2, result._0);
    Assert.same([], result._1);
    var c = result._1;

    result = c.shift();
    Assert.isNull(result._0);
    Assert.same([], result._1);

    Assert.same([1, 2], a);
  }}

  public function testUnshift() {
    for (i in 0...x){
    var a : ReadonlyArray<Int> = [1, 2, 3];
    var b = a.unshift(4);
    Assert.same([1, 2, 3], a);
    Assert.same([4, 1, 2, 3], b);
  }}
}
