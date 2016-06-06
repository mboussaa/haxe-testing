import utest.Runner;
import utest.ui.Report;

class TS1 {
  public static function addTests(runner : Runner) {

var w : String = "";
for (arg in Sys.args()){
w = arg;}
trace('The value of loop_wrapper is $w');

var x : Int = Std.parseInt(w);
 //   runner.addCase(new thx.TestAnonymousMap(x));
 //   runner.addCase(new thx.TestArrays(x));
 //   runner.addCase(new thx.TestAssert(x));
 //   runner.addCase(new thx.TestBigInt(x));
 //   runner.addCase(new thx.TestBitMatrix(x));
 //   runner.addCase(new thx.TestBitSet(x));
 //   runner.addCase(new thx.TestChar(x));
 //   runner.addCase(new thx.TestChars(x));
 //   runner.addCase(new thx.TestConvert(x));
 //   runner.addCase(new thx.TestDates(x));
 //   runner.addCase(new thx.TestDateTime(x));
 //   runner.addCase(new thx.TestDateTimeUtc(x));
 //   runner.addCase(new thx.TestDecimal(x));
 //   runner.addCase(new thx.TestDynamics(x));
 //   runner.addCase(new thx.TestEffects(x));
 //   runner.addCase(new thx.TestEithers(x));
 //   runner.addCase(new thx.TestEnums(x));
 //   runner.addCase(new thx.TestERegs(x));
 //   runner.addCase(new thx.TestError(x));
 //   runner.addCase(new thx.TestFloats(x));
 //   runner.addCase(new thx.TestFunctions(x));
 //   runner.addCase(new thx.TestHashSet(x));
 //   runner.addCase(new thx.TestInt64s(x));
 //   runner.addCase(new thx.TestInts(x));
 //   runner.addCase(new thx.TestIterables(x));
 //   runner.addCase(new thx.TestIterators(x));
 //   runner.addCase(new thx.TestLocalDate(x));
 //   runner.addCase(new thx.TestOrderedMap(x));
 //   runner.addCase(new thx.TestOrderedSet(x));
 //   runner.addCase(new thx.TestMake(x));
 //   runner.addCase(new thx.TestMaps(x));
 //   runner.addCase(new thx.TestNulls(x));
 //   runner.addCase(new thx.TestObjects(x));
 //   runner.addCase(new thx.TestPath(x));
 //   runner.addCase(new thx.TestRational(x));
 //   runner.addCase(new thx.TestReadonlyArray(x));
 //  runner.addCase(new thx.TestQueryString(x));
 //   runner.addCase(new thx.TestSet(x));
 //   runner.addCase(new thx.TestStaticResource(x));
 //   runner.addCase(new thx.TestStrings(x));
 //   runner.addCase(new thx.TestTime(x));
 //   runner.addCase(new thx.TestThx(x));
 //   runner.addCase(new thx.TestLambda(x));
 //   runner.addCase(new thx.TestLambdaStaticExtension(x));
//#if (js || flash)
//    runner.addCase(new thx.TestTimer());
//#end
 //  runner.addCase(new thx.TestTuple(x));
 //  runner.addCase(new thx.TestUrl(x));
 //   runner.addCase(new thx.TestValidation(x));

  //    runner.addCase(new thx.fp.TestList(x));
  //   runner.addCase(new thx.fp.TestMap(x));
  //  runner.addCase(new thx.fp.TestSet(x));
  // runner.addCase(new thx.fp.TestState(x));
    runner.addCase(new thx.fp.TestWriter(x));
  // runner.addCase(new thx.fp.TestTreeBag(x));
}

  public static function main() {
var runner = new Runner();
addTests(runner);
Report.create(runner);
runner.run();

  }
}
