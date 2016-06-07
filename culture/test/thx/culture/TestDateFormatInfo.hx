package thx.culture;

import utest.Assert;

class TestDateFormatInfo {
var x : Int;
  public function new(i) {
 this.x = i;
 }

  public function testInvariant() {
  	for (i in 0...x){
    var dt = DateFormatInfo.invariant;

    Assert.equals('Gregorian', dt.nameCalendar);
    Assert.equals('Sunday', dt.firstDayOfWeekName);
    Assert.equals('AM', dt.designatorAm);
    Assert.equals('PM', dt.designatorPm);
    Assert.equals('January', dt.nameMonths[0]);
  }}
}