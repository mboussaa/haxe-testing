

import nanotest.NanoTestRunner;
class TS11
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestHcl());

        return runner.run();
    }
}


