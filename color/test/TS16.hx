

import nanotest.NanoTestRunner;
class TS16
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
            runner.add(new thx.color.TestTemperature());

        return runner.run();
    }
}


