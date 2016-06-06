package thx;

import utest.Assert;
import thx.Either;
using thx.Eithers;

class TestEithers {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testIsLeft() {
    for (i in 0...x){
    Assert.isTrue(Left(123).isLeft());
    Assert.isFalse(Right(123).isLeft());
  }}

  public function testIsRight() {
    for (i in 0...x){
    Assert.isFalse(Left(123).isRight());
    Assert.isTrue(Right(123).isRight());
  }}

  public function testToLeft() {
    for (i in 0...x){
    Assert.same(123, switch Left(123).toLeft() {
      case Some(v) : v;
      case None: null;
    });

    Assert.isNull(switch Right(123).toLeft() {
      case Some(v) : v;
      case None: null;
    });
  }}

  public function testToRight() {
    for (i in 0...x){
    Assert.same(123, switch Right(123).toRight() {
      case Some(v) : v;
      case None: null;
    });

    Assert.isNull(switch Left(123).toRight() {
      case Some(v) : v;
      case None: null;
    });
  }}

  public function testToLeftUnsafe() {
    for (i in 0...x){
    Assert.same(123, Left(123).toLeftUnsafe());
    Assert.same(null, Right(123).toLeftUnsafe());
  }}

  public function testToRightUnsafe() {
    for (i in 0...x){
    Assert.same(123, Right(123).toRightUnsafe());
    Assert.same(null, Left(123).toRightUnsafe());
  }}

  public function testFlatMap() {
    for (i in 0...x){
    Assert.same(5, Left(5).flatMap(function(r) {
      return Left(10);
    }).toLeftUnsafe());

    Assert.same(5, Left(5).flatMap(function(r) {
      return Right(10);
    }).toLeftUnsafe());

    Assert.same(10, Right(5).flatMap(function(r) {
      return Left(10);
    }).toLeftUnsafe());

    Assert.same(null, Right(5).flatMap(function(r) {
      return Right(10);
    }).toLeftUnsafe());

    Assert.same(null, Left(5).flatMap(function(r) {
      return Left(10);
    }).toRightUnsafe());

    Assert.same(null, Left(5).flatMap(function(r) {
      return Right(10);
    }).toRightUnsafe());

    Assert.same(null, Right(5).flatMap(function(r) {
      return Left(10);
    }).toRightUnsafe());

    Assert.same(10, Right(5).flatMap(function(r) {
      return Right(10);
    }).toRightUnsafe());
  }}

  public function testLeftMap() {
    for (i in 0...x){
    var l: Either<Int, Bool> = Left(1);
    var rt: Either<Int, Bool> = Right(true);
    var l2: Either<Int, Bool> = Left(2);
    Assert.same(l2, l.leftMap(function(i) { return i + 1; }));
    Assert.same(rt, rt.leftMap(function(i) { return i + 1; }));
  }}
}
