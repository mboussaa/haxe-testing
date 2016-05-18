import utest.Runner;
import utest.ui.Report;

class TS4 {
  public static function addTests(runner : Runner) {
   // runner.addCase(new thx.color.TestLab());
   // runner.addCase(new thx.color.TestLCh());
   // runner.addCase(new thx.color.TestLuv());
    runner.addCase(new thx.color.TestColor());
 }

  public static function main() {
    var runner = new Runner();
    addTests(runner);
    Report.create(runner);
    runner.run();
  }
}
