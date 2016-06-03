package thx.color;

import thx.color.Color;
import thx.color.palettes.Web;
import utest.Assert;
using thx.Iterators;

class TestConversion {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testLab() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Lab = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testLCh() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : LCh = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testLuv() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Luv = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testCmy() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Cmy = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testCmyk() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Cmyk = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testCubehelix() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : CubeHelix = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testHsl() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Hsl = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testHsv() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Hsv = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testHunterLab() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : HunterLab = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testRgbx() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Rgbx = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testXyz() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Xyz = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testYuv() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Yuv = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}

  public function testYxy() {
    for (i in 0...x){
    Web.names.keys().map(function(name) {
      var expected : Rgb = Web.names.get(name),
          color : Yxy = expected,
          test : Rgb = color;
      Assert.equals(expected.toString(), test.toString(), 'expected $expected but was $test for $name');
    });
  }}
}
