import nanotest.NanoTestRunner;
class TS3
{
    public static function main():Bool
    {
        var runner = new NanoTestRunner();
for (i in 0...1000){          
  runner.add(new thx.color.TestLuv());
}
        return runner.run();
    }
}
