

import nanotest.NanoTestRunner;
class TS10
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestGrey());

        return runner.run();
    }
}


