

import nanotest.NanoTestRunner;
class TS17
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestXyz());

        return runner.run();
    }
}


