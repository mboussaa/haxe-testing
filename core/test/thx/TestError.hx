package thx;

import thx.error.AbstractMethod;
import thx.error.NotImplemented;
using thx.error.NullArgument;
import utest.Assert;

class TestError {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testAbstract() {
    for (i in 0...x){
    var error = new AbstractMethod();

    Assert.notNull(error);
    Assert.stringContains('TestError', error.message);
    Assert.stringContains('testAbstract', error.message);
    Assert.stringContains('is abstract', error.message);
  }}

  public function testNotImplemented() {
    for (i in 0...x){
    var error = new NotImplemented();

    Assert.notNull(error);
    Assert.stringContains('TestError', error.message);
    Assert.stringContains('testNotImplemented', error.message);
    Assert.stringContains('needs to be implemented', error.message);
  }}

  public function testNullArgument() {
    for (i in 0...x){
    Assert.raises(function() nullInt(null), NullArgument);
    nullInt(1); // will not throw
  }}

  public function testNullArgumentUsing() {
    for (i in 0...x){
    Assert.raises(function() nullUsingInt(null), NullArgument);
    nullUsingInt(1); // will not throw
  }}

  public function testEmptyArray() {
    for (i in 0...x){
    Assert.raises(function() emptyArray(null), NullArgument);
    Assert.raises(function() emptyArray([]), NullArgument);
    emptyArray([1]); // will not throw
  }}

  public function testEmptyString() {
    for (i in 0...x){
    Assert.raises(function() emptyString(null), NullArgument);
    Assert.raises(function() emptyString(""), NullArgument);
    emptyString("a"); // will not throw
  }}

  public function testEmptyIterator() {
    for (i in 0...x){
    var it = new IntIterator(0, 0);
    Assert.raises(function() emptyIterator(null), NullArgument);
    Assert.raises(function() emptyIterator(it), NullArgument);
    var it = new IntIterator(0, 4);
    emptyIterator(it); // will not throw
  }}

  public function testEmptyIterable() {
    for (i in 0...x){
    var it = { iterator : function() return new IntIterator(0, 0) };
    Assert.raises(function() emptyIterable(null), NullArgument);
    Assert.raises(function() emptyIterable(it), NullArgument);
    var it = { iterator : function() return new IntIterator(0, 4) };
    emptyIterable(it); // will not throw
  }}

  public function nullInt(i : Null<Int>)
    NullArgument.throwIfNull(i);

  public function nullUsingInt(i : Null<Int>)
    i.throwIfNull();

  public function emptyArray(arr : Array<Int>)
    arr.throwIfEmpty();

  public function emptyString(s : String)
    s.throwIfEmpty();

  public function emptyIterator(it : Iterator<Int>)
    it.throwIfEmpty();

  public function emptyIterable(it : Iterable<Int>)
    it.throwIfEmpty();
}
