import utest.Runner;
import utest.ui.Report;

class TS2 {
  public static function addTests(runner : Runner) {
   // runner.addCase(new thx.color.TestLab());
    runner.addCase(new thx.color.TestLCh());
  }

  public static function main() {
    var runner = new Runner();
    addTests(runner);
    Report.create(runner);
    runner.run();
  }
}

