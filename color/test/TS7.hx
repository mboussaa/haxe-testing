

import nanotest.NanoTestRunner;
class TS7
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestCmy());

        return runner.run();
    }
}


