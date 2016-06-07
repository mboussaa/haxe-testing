
package test;
import nanotest.NanoTestRunner;

/**
 * ...
  in 0...100)  {
* @author TABIV
 */
class TS7
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
        var doFunctionalTests = true;
        var w : String = "";
        for (arg in Sys.args()){
        w = arg;
        }
        trace('The value of loop_wrapper is $w');
        var x : Int = Std.parseInt(w);  
        for (i in 0...x){
        runner.add(new TestGeom());
        }
        
        return runner.run();
    }
}