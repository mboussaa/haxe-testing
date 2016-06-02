
import nanotest.NanoTestRunner;
class TS18
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestYxy());

        return runner.run();
    }
}


