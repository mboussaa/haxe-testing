import test.TestAll;
class Test {
    static function main() {
        var passed = TestAll.main();
        
        #if (sys && !EXIT_ON_FINISH)
        Sys.stdin().readLine();
        #else
      
        #end
    }
}
