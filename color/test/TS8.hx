

import nanotest.NanoTestRunner;
class TS8
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestCmyk());

        return runner.run();
    }
}


