package times;

import java.io.PrintWriter;
import java.util.Arrays;
import run.duke.ToolCall;
import run.duke.ToolOperator;
import run.duke.ToolRunner;

public record TimesToolOperator(String name) implements ToolOperator {
  public TimesToolOperator() {
    this("times");
  }

  @Override
  public int run(ToolRunner runner, PrintWriter out, PrintWriter err, String... args) {
    var times = Integer.parseInt(args[0]);
    var tool = args[1];
    out.printf("%d-time%s %s {%n", times, times == 1 ? "" : "s", tool);
    for (int i = 0; i < times; i++) {
      runner.run(tool, (Object[]) Arrays.copyOfRange(args, 2, args.length));
    }
    out.println("}");
    return 0;
  }
}
