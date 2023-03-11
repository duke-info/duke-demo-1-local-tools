package threetimes;

import java.io.PrintWriter;
import java.util.spi.ToolProvider;
import run.duke.Tool;
import run.duke.ToolCall;
import run.duke.ToolOperator;
import run.duke.ToolRunner;

public record ThreeTimesToolOperator(String name) implements ToolOperator {
  public ThreeTimesToolOperator() {
    this("3x");
  }

  @Override
  public int run(ToolRunner runner, PrintWriter out, PrintWriter err, String... args) {
    out.println("3x {");
    runner.run("greet");
    runner.run(ToolCall.of("greet"));
    runner.run(Tool.of(ToolProvider.findFirst("greet").orElseThrow()));
    out.println("} 3x");
    return 0;
  }
}
