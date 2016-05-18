import nanotest.NanoTestRunner;

class TestAll
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();

        //var doFunctionalTests = true;
        //var doStressTests = false;

   
            for (i in 0...3000)
            runner.add(new TestLCh());

            //for (i in 0...3000)
            //runner.add(new Test2D());
            // runner.add(new Test3D());
            //runner.add(new TestMathUtil());
            //runner.add(new TestConverters());
            //runner.add(new TestFrames());
            //runner.add(new TestIntMath());
            //runner.add(new TestGeom());
            //runner.add(new TestDataStructures());
     

        return runner.run();
    }
}



//import utest.Runner;
//import utest.ui.Report;

//class TestAll {
//  public static function addTests(runner : Runner) {  
//runner.addCase(new thx.color.TestLab());
//for (i in 0...100)  {
//runner.addCase(new thx.color.TestLCh());
//   runner.addCase(new thx.color.TestLCh());
//}
   // runner.addCase(new thx.color.TestLuv());
   // runner.addCase(new thx.color.TestColor());
   // runner.addCase(new thx.color.TestColorParser());
   // runner.addCase(new thx.color.TestConversion());
    //runner.addCase(new thx.color.TestCmy());
   // runner.addCase(new thx.color.TestCmyk());
   // runner.addCase(new thx.color.TestCubeHelix());
   // runner.addCase(new thx.color.TestGrey());
   // runner.addCase(new thx.color.TestHcl());
    //runner.addCase(new thx.color.TestHsl());
    //runner.addCase(new thx.color.TestHsv());
    //runner.addCase(new thx.color.TestRgb());
    //runner.addCase(new thx.color.TestRgbx());
    //runner.addCase(new thx.color.TestTemperature());
    //runner.addCase(new thx.color.TestXyz());
    //runner.addCase(new thx.color.TestYxy());

    //runner.addCase(new thx.color.TestRoundTrip());
//  }

//  public static function main() {
    

//var runner = new Runner(); 
//for (i in 0...100)  {
//addTests(runner);}
//    Report.create(runner);
//    runner.run();
//  }
//}
