import utest.Runner;
import utest.ui.Report;

class TS8 {
  public static function addTests(runner : Runner) {
    //runner.addCase(new thx.color.TestLab());
    //runner.addCase(new thx.color.TestLCh());
    //runner.addCase(new thx.color.TestLuv());
    //runner.addCase(new thx.color.TestColor());
    //runner.addCase(new thx.color.TestColorParser());
    //runner.addCase(new thx.color.TestConversion());
    //runner.addCase(new thx.color.TestCmy());
    runner.addCase(new thx.color.TestCmyk());
 }

  public static function main() {
    var runner = new Runner();
    addTests(runner);
    Report.create(runner);
    runner.run();
  }
}
